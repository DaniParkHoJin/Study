-- 부속질의를 사용하여 복잡한 질의 해결(서브쿼리)
-- HR 부서의 어떤 사원은 급여 정보를 조회하는 업무를 맡고 있다. Tucker(last_name) 사원보다 급여를 많이 받고 있는 사원의 성과 이름(Name 으로 별칭), 업무, 급여를 출력하시오.
SELECT E.FIRST_NAME || ' ' || E.LAST_NAME AS NAME, E.JOB_ID, E.SALARY
FROM EMPLOYEES E
WHERE SALARY > (SELECT SALARY
                FROM EMPLOYEES
                WHERE LAST_NAME = 'Tucker');

-- 문제 1
-- 사원의 급여 정보 중 업무별 최소 급여를 받고 있는 사원의 성과 이름(Name로 별칭), 업무, 급여, 입사일을 출력하시오.
SELECT E.FIRST_NAME || ' ' || E.LAST_NAME AS Name, E.JOB_ID, E.SALARY, E.HIRE_DATE
FROM EMPLOYEES E
WHERE SALARY < ANY (SELECT MIN(SALARY)
                    FROM EMPLOYEES
                    GROUP BY JOB_ID);

-- 문제 2
-- 소속 부서의 평균 급여보다 많은 급여를 받는 사원에 대하여 사원의 성과 이름(Name으로 별칭), 급여, 부서번호, 업무를 출력하시오.
SELECT E.FIRST_NAME || ' ' || E.LAST_NAME AS Name, E.SALARY, D.DEPARTMENT_ID, E.JOB_ID
FROM EMPLOYEES E,
     (SELECT DEPARTMENT_ID, AVG(SALARY) AS D_SALARY
      FROM EMPLOYEES
      GROUP BY DEPARTMENT_ID) D
WHERE E.DEPARTMENT_ID = D.DEPARTMENT_ID
  AND D_SALARY = E.SALARY;

-- 문제 3
-- 사원들의 지역별 근무 현황을 조회하고자 한다.
-- 도시 이름이 영문 알파벳 'O'로 시작하는 지역에 살고 있는 사원의 사번, 이름, 업무, 입사일을 출력하시오.

SELECT EMPLOYEE_ID, FIRST_NAME || ' ' || LAST_NAME AS Name, JOB_ID, HIRE_DATE
FROM EMPLOYEES
WHERE DEPARTMENT_ID
          IN (SELECT DEPARTMENT_ID
              FROM DEPARTMENTS
              WHERE LOCATION_ID IN (SELECT LOCATION_ID
                                    FROM LOCATIONS L
                                    WHERE CITY LIKE 'O%'
                                    GROUP BY LOCATION_ID));

SELECT EMPLOYEE_ID, FIRST_NAME || ' ' || LAST_NAME AS Name, JOB_ID, HIRE_DATE
FROM EMPLOYEES
WHERE DEPARTMENT_ID IN (SELECT DEPARTMENT_ID
                        FROM DEPARTMENTS
                        WHERE LOCATION_ID IN (SELECT LOCATION_ID
                                              FROM LOCATIONS
                                              WHERE CITY LIKE 'O%'));

-- 문제 4
-- 모든 사원의 소속부서 평균급여를 계산하여,
-- 사원별로 사원의 성과 이름(Name으로 별칭), 업무, 급여, 부서번호, 부서 평균 급여(Department Avg Salary)을 출력하시오.
SELECT EMPLOYEE_ID, FIRST_NAME || ' ' || LAST_NAME AS Name, JOB_ID, SALARY, DEPARTMENT_ID
FROM EMPLOYEES;

SELECT DEPARTMENT_ID, AVG(SALARY)
 FROM EMPLOYEES
 GROUP BY DEPARTMENT_ID;

-- 국제 표준 방식
SELECT E.EMPLOYEE_ID, E.FIRST_NAME || ' ' || E.LAST_NAME AS Name, E.JOB_ID, E.SALARY, E.DEPARTMENT_ID, D.AVGSAL
FROM EMPLOYEES E,
     (SELECT DEPARTMENT_ID, ROUND(AVG(SALARY), 2) AVGSAL
      FROM EMPLOYEES
      GROUP BY DEPARTMENT_ID) D
WHERE D.DEPARTMENT_ID = E.DEPARTMENT_ID;
-- ANSI 미국 방식
SELECT E.EMPLOYEE_ID, E.FIRST_NAME || ' ' || E.LAST_NAME AS Name, E.JOB_ID, E.SALARY, E.DEPARTMENT_ID, D.AVGSAL
FROM EMPLOYEES E
         JOIN (SELECT DEPARTMENT_ID, ROUND(AVG(SALARY), 2) AVGSAL
               FROM EMPLOYEES
               GROUP BY DEPARTMENT_ID) D ON (D.DEPARTMENT_ID = E.DEPARTMENT_ID)





SELECT E.FIRST_NAME || ' '||E.LAST_NAME AS Name, E.JOB_ID, E.SALARY, E.HIRE_DATE FROM EMPLOYEES E WHERE SALARY < ANY(SELECT MIN(SALARY)FROM EMPLOYEES GROUP BY JOB_ID), OriginalSql = SELECT E.FIRST_NAME || ' 'E.LAST_NAME AS Name, E.JOB_ID, E.SALARY, E.HIRE_DATE FROM EMPLOYEES E WHERE SALARY < ANY(SELECT MIN(SALARY)FROM EMPLOYEES GROUP BY JOB_ID)