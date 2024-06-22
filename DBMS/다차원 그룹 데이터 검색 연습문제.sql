-- HR 부서에서는 부서와 업무별 급여 합계를 구하여 신년도 급여 수준 레벨을 지정하고자 한다.
-- 부서번호와 업무를 기준으로 전체 행을 그룹 별로 나누어 급여와 함께 인원 수를 출력하시오.
SELECT DEPARTMENT_ID,
       JOB_ID,
       to_char(SUM(SALARY), '$999,999.00') AS "Salay SUM",
       COUNT(EMPLOYEE_ID) AS "COUNT EMPs"
FROM EMPLOYEES
GROUP BY DEPARTMENT_ID, JOB_ID
--CUBE(DEPARTMENT_ID, JOB_IB)
ORDER BY department_id;

-- 위 결과에서 부서번호와 업무를 기준으로 전체 행을 그룹별로 나누어 급여 합계와 인원 수를 출력하고,
-- 부서번호와 업무 각각에 대하여 그룹화된 총 합계와 인원 수를 출력하시오.
SELECT DEPARTMENT_ID,
       JOB_ID,
       to_char(SUM(SALARY), '$999,999.00') AS "Salay SUM",
       COUNT(EMPLOYEE_ID) AS "COUNT EMPs"
FROM EMPLOYEES
GROUP BY ROLLUP (DEPARTMENT_ID, JOB_ID)
ORDER BY department_id;

-- 위 샘플 문제의 결과를 보면 JOB_ID에 대한 집계는 나타나지 않았다.
-- 업무에 대해서도 샘플과 같은 총 집계가 이루어지도록 쿼리를 수정하시오.

SELECT DEPARTMENT_ID,
       JOB_ID,
       to_char(SUM(SALARY), '$999,999.00') AS "Salay SUM",
       COUNT(EMPLOYEE_ID) AS "COUNT EMPs"
FROM EMPLOYEES
GROUP BY CUBE (DEPARTMENT_ID, JOB_ID)
ORDER BY department_id;

-- GROUPING 함수를 이용하여 위에서 나온 결과들이 GROUP BY 에 의한 갤과인지,
-- 아닌지를 식별하시오.

SELECT DEPARTMENT_ID,
       JOB_ID,
       to_char(SUM(SALARY), '$999,999.00') AS "Salay SUM",
       COUNT(EMPLOYEE_ID) AS "COUNT EMPs",
       GROUPING(DEPARTMENT_ID) AS GROUPING_DEPARTMENT_ID,
       GROUPING(JOB_ID) AS GROUPING_JOB_ID
FROM EMPLOYEES
GROUP BY CUBE (DEPARTMENT_ID, JOB_ID)
ORDER BY department_id;

-- 위 샘플 문제의 결과를 근거로 부서에 대한 집계 결과가 아니면 (ALL_DEPTS) 라고 출력하고,
-- 업무에 대한 집계 결과가 아니면 (ALL_JOBS)출력하며, 해당 집계에 대한 사원 수와 평균 연봉을 구하시오.
-- <HINT> ROLLUP, GROUPING 함수를 사용한다.

-- 수정 필요
SELECT DEPARTMENT_ID,
       JOB_ID,
       to_char(SUM(SALARY), '$999,999.00') AS "Salay SUM",
       COUNT(EMPLOYEE_ID) AS "COUNT EMPs",
       GROUPING(DEPARTMENT_ID) AS GROUPING_DEPARTMENT_ID,
       GROUPING(JOB_ID) AS GROUPING_JOB_ID
FROM EMPLOYEES
GROUP BY CUBE (DEPARTMENT_ID, JOB_ID)
ORDER BY department_id;
