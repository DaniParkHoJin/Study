-- 서브쿼리

-- 작은 것부터 하나씩 먼저 찾은 정보를 서브로 넣는다.
-- 순수대로 차례 차례 부모의 WHERE 에 넣는데, 조건부터 만들어라.
-- 오른쪽에 서브 쿼리를 넣어야 한다.

-- SELECT 문장 안에 포함된 또 하나의 SELECT 문장이다.
-- 서브쿼리를 포함하고 있는 쿼리문을 메인 쿼리, 포함된 또 하나의 쿼리를 서브쿼리라 한다.

-- 직원의 이름이 SUSAN인 직원이 어떤 부서 소속인지 소속 부서명을 먼저 알아내고
-- 그 조건으로 다시 쿼리문을 만든다. 괄호 안에 넣어야 한다.

SELECT DEPARTMENT_ID
FROM EMPLOYEES
WHERE FIRST_NAME = 'Susan';
-- Susan의 부서번호는 40이다.
SELECT DEPARTMENT_NAME
FROM DEPARTMENTS
WHERE DEPARTMENT_ID = 40;
-- 40번 부서 조건을 변경
SELECT DEPARTMENT_NAME
FROM DEPARTMENTS
WHERE DEPARTMENT_ID = (SELECT DEPARTMENT_ID
                       FROM EMPLOYEES
                       WHERE FIRST_NAME = 'Susan');

-- EMPLOYEES 테이블에서 Lex와 같은 부서에 있는 모든 사원의 이름과 입사일자를 출력하는 SELECT 문을 작성하시오.
-- Lex의 부서를 제일 먼저 알아야 한다.
SELECT DEPARTMENT_ID
FROM EMPLOYEES
WHERE FIRST_NAME = 'Lex';
-- Lex는 90번 부서다. 그러면 그 부서가 서브쿼리가 된다.
SELECT FIRST_NAME, HIRE_DATE
FROM EMPLOYEES
WHERE DEPARTMENT_ID = 90;
-- 위 둘을 합친다.
SELECT FIRST_NAME, HIRE_DATE
FROM EMPLOYEES
WHERE DEPARTMENT_ID = (SELECT DEPARTMENT_ID
                       FROM EMPLOYEES
                       WHERE FIRST_NAME = 'Lex');

-- 문제 1 EMPLOYEES 테이블에서 CEO 에게 보고하는 직원의 모든 정보를 출력하는 SELECT 문을 작성하시오.
-- ceo 찾고 그 정보를 토대로 분석 CEO는 EMPLOYEES_ID 가 100
SELECT *
FROM EMPLOYEES
WHERE MANAGER_ID IS NULL;
-- CEO 는 100번
SELECT *
FROM EMPLOYEES
WHERE MANAGER_ID = 100;

SELECT *
FROM EMPLOYEES
WHERE MANAGER_ID = (SELECT EMPLOYEE_ID
                    FROM EMPLOYEES
                    WHERE MANAGER_ID IS NULL);

-- 단일 행 서브 쿼리
-- 단일 행 Sub Query(Single Row)는 내부 SELECT 문장으로부터 오직 하나의 행만 반환 방으며, 단일 행 비교 연산자를 사용한다.

-- Guy와 같은 부서에서 근무하는 사원의 정보를 출력하라
SELECT EMPLOYEE_ID, FIRST_NAME, JOB_ID, SALARY, NVL(COMMISSION_PCT, 0) COMMITSION_PCT
FROM EMPLOYEES
WHERE DEPARTMENT_ID = (SELECT DEPARTMENT_ID
                       FROM EMPLOYEES
                       WHERE FIRST_NAME = 'Guy');

-- 1. 서븐쿼리에서 그룹 함수의 사용
-- 서브 쿼리를 사용하여 평균 급여보다 더 많은 급여를 받는 사원을 검색하는 쿼리
SELECT AVG(SALARY)
FROM EMPLOYEES;

SELECT FIRST_NAME, SALARY
FROM EMPLOYEES
WHERE SALARY > (SELECT AVG(SALARY)
                FROM EMPLOYEES);

-- 다중 행 서브 쿼리
-- 다중 행 서브 쿼리는 서브 쿼리에서 반환되는 결과가 하나 일상의 행일 때 사용하는 서브 쿼리이다.
-- 다중 행 서브 쿼리는 반드시 다중 행 연산자(IN ANY ALL EXIST)와 함께 사용해야 한다.

-- IN
-- 메인 쿼리의 비교 조건이 서브쿼리의 결과 중에 하나라도 일치하면 참

-- 급여를 3000 이상 받는 사원이 소속된 부서와 동일한 부서에서 근무하는 사원을 출력하라.
SELECT FIRST_NAME, SALARY, DEPARTMENT_ID
FROM EMPLOYEES
WHERE DEPARTMENT_ID IN (SELECT DISTINCT DEPARTMENT_ID
                        FROM EMPLOYEES
                        WHERE SALARY >= 13000);
-----------------
SELECT EMPLOYEE_ID, FIRST_NAME, SALARY
FROM EMPLOYEES
WHERE DEPARTMENT_ID IN (SELECT DISTINCT DEPARTMENT_ID
                        FROM EMPLOYEES
                        WHERE FIRST_NAME LIKE '%z%')
ORDER BY DEPARTMENT_ID;

-------------------
SELECT FIRST_NAME, JOB_ID, SALARY
FROM EMPLOYEES
WHERE SALARY IN (SELECT SALARY
                 FROM EMPLOYEES
                 WHERE FIRST_NAME IN ('Susan', 'Lex')
                   AND (FIRST_NAME <> 'Susna'
                     AND FIRST_NAME <> 'Lex'));

--------------------
SELECT EMPLOYEE_ID, FIRST_NAME, JOB_ID, DEPARTMENT_ID
FROM EMPLOYEES
WHERE EMPLOYEE_ID IN (SELECT MANAGER_ID
                      FROM EMPLOYEES);

-- 문제2
-- EMPLOYEES 테이블에서 Accounting 부서에 근무하는 직원과 같은 업무를 하는 직원의 이름, 업무명을 출력하는 SELECT 를 작성하시오.
SELECT FIRST_NAME, JOB_ID, DEPARTMENT_ID
FROM EMPLOYEES
WHERE DEPARTMENT_ID = (SELECT DEPARTMENT_ID
                       FROM DEPARTMENTS
                       WHERE DEPARTMENT_NAME = 'Accounting');

-- ALL 연산
-- ALL 조건은 메인 쿼리의 비교 조건이 서브쿼리의 검색 결과와 모든 값이 일치하면 참이다.
-- 찾아진 값에 대해서 AND 연산을 해서 모두 참이면 참이 되는 셈이다.
-- > ALL 은 '모든 비교 갑보다 크냐'고 묻는 것이 되므로 최대값보다 더 크면 참이 된다.

SELECT FIRST_NAME, SALARY
FROM EMPLOYEES
WHERE SALARY > ALL (SELECT SALARY
                    FROM EMPLOYEES
                    WHERE DEPARTMENT_ID = 30)
ORDER BY SALARY DESC;
-- 아래와 동일하다.
SELECT FIRST_NAME, SALARY
FROM EMPLOYEES
WHERE SALARY > (SELECT MAX(SALARY)
                FROM EMPLOYEES
                WHERE DEPARTMENT_ID = 30)
ORDER BY SALARY DESC;

-- < ALL 은 위와 반대로 모든 비교 값보다 작냐고 묻는 것이다.
SELECT FIRST_NAME, SALARY
FROM EMPLOYEES
WHERE SALARY > ANY (SELECT SALARY
                    FROM EMPLOYEES
                    WHERE EMPLOYEE_ID = 110)
ORDER BY SALARY ASC;
-- 아래와 동일하다.
SELECT FIRST_NAME, SALARY
FROM EMPLOYEES
WHERE SALARY > (SELECT MAX(SALARY)
                FROM EMPLOYEES
                WHERE EMPLOYEE_ID = 110)
ORDER BY SALARY ASC;


-- EXISTS
-- 서브쿼리의 결과 값이 존재하면 바로 메인 쿼리의 결과 값을 리턴한다.
-- IN 보다 훨씬 빠르다. 반대 말로 NOT EXISTS 로 사용가능하다.

SELECT *
FROM DEPARTMENTS
WHERE EXISTS (SELECT *
              FROM EMPLOYEES
              WHERE EMPLOYEE_ID = 10);

-- 비교할 열이 여러 개인 다중 열 서브쿼리
-- 메인쿼리에 비교할 열을 괄호로 묶어 명시하고
-- 서브쿼리에서는 괄호로 묶은 데이터와 같은 자료형 데이터를 SELECT절에 명시하여 사용할 수 있다.

SELECT *
FROM EMPLOYEES
WHERE (DEPARTMENT_ID, SALARY) IN (SELECT DEPARTMENT_ID, MAX(SALARY)
                                  FROM EMPLOYEES
                                  GROUP BY DEPARTMENT_ID);

-- FROM 에 사용하는 서브쿼리와 WITH
SELECT E10.EMPLOYEE_ID, E10.FIRST_NAME, E10.DEPARTMENT_ID, D.DEPARTMENT_NAME, D.LOCATION_ID
FROM (SELECT *
      FROM EMPLOYEES
      WHERE DEPARTMENT_ID = 10) E10,
     (SELECT * FROM DEPARTMENTS) D
WHERE E10.DEPARTMENT_ID = D.DEPARTMENT_ID;
-- WITH 사용
WITH E10 AS (SELECT * FROM EMPLOYEES WHERE DEPARTMENT_ID = 10),
     D AS (SELECT * FROM DEPARTMENTS)
SELECT E10.EMPLOYEE_ID, E10.FIRST_NAME, E10.DEPARTMENT_ID, D.DEPARTMENT_NAME, D.LOCATION_ID
FROM E10,
     D
WHERE E10.DEPARTMENT_ID = D.DEPARTMENT_ID;

-- SELECT 에 사용하는 서브쿼리
SELECT EMPLOYEE_ID,
       FIRST_NAME,
       JOB_ID,
       SALARY,
       (SELECT GRADE
        FROM SALARYGRADE
        WHERE E.SALARY BETWEEN MINSALARY AND MAXSALARY)    AS SALGREDE,
       DEPARTMENT_ID,
       (SELECT DEPARTMENT_NAME
        FROM DEPARTMENTS
        WHERE E.DEPARTMENT_ID = DEPARTMENTS.DEPARTMENT_ID) AS DANME
FROM EMPLOYEES E;


-- 서브쿼리로 테이블 작성하기
CREATE TABLE EMP01
AS
SELECT *
FROM EMPLOYEES;
-- 작성된 테이블 확인
SELECT *
FROM EMP01;
-- 특정 컬럼만 선택적으로 복사하려면 복사할 칼럼의 이름을 기술해주면 된다.
CREATE TABLE EMP02
AS
SELECT EMPLOYEE_ID, FIRST_NAME
FROM EMPLOYEES;
-- 작성된 테이블 확인
SELECT *
FROM EMP02;
--  테이블 구조만 복사하기
CREATE TABLE EMP03
AS
SELECT *
FROM EMPLOYEES
WHERE 1 = 0;
-- 작성된 테이블 확인
SELECT *
FROM EMP03;

-- 서브 쿼리를 이용한 테이터 추가
CREATE TABLE DEPT01
AS
SELECT *
FROM DEPARTMENTS
WHERE 1 = 0;

SELECT *
FROM DEPT01;

INSERT INTO DEPT01
SELECT *
FROM DEPARTMENTS;

SELECT *
FROM DEPT01;

-------------------
-- 문제 3
-- 직급이 'ST_MAN'인 직원이 받는 급여들의 최소 급여보다 많이 받는 직원들의 이름과 급여를 출력하되
-- 부서번호가 20번인 직원은 제외한다.
SELECT FIRST_NAME, SALARY
FROM EMPLOYEES
WHERE SALARY > ANY (SELECT SALARY
                    FROM EMPLOYEES
                    WHERE JOB_ID = 'ST_MAN'
                      AND DEPARTMENT_ID <> 20);


-- 문제 4
-- EMPLOYEES 테이블에서 Valli 라는 이름을 가진 직원과 업무명 및 원급이 같은 사원의 모든 정보를 출력하는 SELECT 문을 작성하시오.
-- 결과에서 Vaili 는 제외
SELECT FIRST_NAME, SALARY
FROM EMPLOYEES
WHERE (JOB_ID, SALARY) IN (SELECT JOB_ID, SALARY
                           FROM EMPLOYEES
                           WHERE FIRST_NAME = 'Valli')
  AND FIRST_NAME <> 'Valli';

-- 문제 5
-- EMPLOYEES 테이블에서 월급이 자신이 속한 부서의 평균 월급보다 높은 사원의 부서번호, 이름, 급여를 출력하는 SELECT 문을 작성하시오.
SELECT E.DEPARTMENT_ID, E.FIRST_NAME, E.SALARY, D.DEPARTMENT_ID, ROUND(D.D_SALARY, 1) AS D_SALARY
FROM EMPLOYEES E,
     (SELECT DEPARTMENT_ID, ROUND(AVG(SALARY), 1) AS D_SALARY
      FROM EMPLOYEES
      GROUP BY DEPARTMENT_ID) D
WHERE E.DEPARTMENT_ID = D.DEPARTMENT_ID
  AND E.SALARY > D.D_SALARY
ORDER BY D.D_SALARY;