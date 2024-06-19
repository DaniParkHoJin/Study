-- 단일 행 함수와 그룹 행 함수는 함께 사용할 수 없다. 단일 행 함수는 여러 행이지만 그룹 행 함수는 한 행만 나온다.

-- SUM : 그룹의 누적 합계를
-- AVG : 그룹의 평균을 반환
-- MAX : 그룹의 최댓값을 반환
-- MIN : 그룹의 최솟값을 반환
-- COUNT : 그룹의 총 갯수를 반환

-- SUM
SELECT SUM(salary)
FROM EMPLOYEES;

SELECT TO_CHAR(SUM(salary),'$999,9999') AS TOTAL
FROM EMPLOYEES;

-- AVG
SELECT AVG(salary)
FROM EMPLOYEES;

SELECT ROUND(AVG(SALARY),1)
FROM EMPLOYEES;

-- 최근에 입사한 사원과 가장 오래 전에 입사한 사원의 입사일 출력하기(MAX/MIN 함수)
SELECT TO_CHAR(MAX(hire_date),'YYYY-MM-DD'), TO_CHAR(MIN(hire_date),'YYYY-MM-DD')
FROM EMPLOYEES;

-- JOB의 종류가 몇 개인지? 즉, 중복되지 않은 직업의 갯수를 구해라.
SELECT COUNT(DISTINCT(Job_id))
FROM EMPLOYEES;

-- GROUP BY
-- 일반적으로 쿼리문으로부터 얻은 결과에 대해 GROUP BY 절에 명시한 칼럼의 값이 같을 때 그룹을 만들고
-- 이 그룹으로부터 SQL 표준 함수인 그룹 함수를 통해 다양한 결과를 얻는다.
-- 특정 그룹으로 묶어 데이터 집계 시 사용,
-- WHERE 과 ORDER BY 사이에 위치
-- 집계(그룹)함수와 함께 사용
-- **** SELECT 리스트에서 집계 함수를 제외한 모든 컬럼과 표현식은 GROUP BY 에 명시해야함. 동일한 칼럼명이어야 한다.

-- SELECT 칼럼명1, 그룹함수(컬럼명)
-- FROM 테이블명
-- WHERE 조건문
-- GROUP BY 칼럼명1

-- 사원들을 부서 번호 기준으로 그룹화하고 오름차순으로 정렬
SELECT department_id
FROM EMPLOYEES
GROUP BY department_id
ORDER BY department_id ASC;

-- 부서별 최대 급여와 최소급여 구하기
SELECT department_id, MAX(salary), MIN(SALARY)
FROM EMPLOYEES
GROUP BY department_id
ORDER BY department_id;

-- 소속 부서별 급여의 합과 급여의 평균 구하기(평균은 반올림 필요)
SELECT department_id, SUM(salary), ROUND(AVG(SALARY),1)
FROM EMPLOYEES
GROUP BY department_id
ORDER BY department_id;


-- HAVING 조건
-- SELECT 에 조건을 사용하여 결과를 제한할 때는 WHERE 를 사용하지만, 그룹의 결과를 제한할 할 때는 HAVING 을 사용한다
-- GROUP BY 다음에 위치해 GROUP BY 한 결과를 대상으로 다시 필터를 거는 역할
-- HAVING 다음에는 SELECT 리스트에 사용했던 집계 함수를 이용한 조건을 명시

SELECT department_id, AVG(salary)
FROM EMPLOYEES
GROUP BY department_id
ORDER BY department_id;

-- 변경(급여 평균이 5000이상인 것만)
SELECT department_id, AVG(salary)
FROM EMPLOYEES
GROUP BY department_id
HAVING AVG(salary)>= 5000
ORDER BY department_id;

-- 변경(급여 최대값이 5000 이상인 것만(10번 부서가 제외됨)
SELECT department_id, MAX(salary), MIN(salary)
FROM EMPLOYEES
GROUP BY department_id
HAVING MAX(salary) > 5000
ORDER BY department_id;


-- ROLLUP(EXPR1, EXPR2)
-- GROUP BY 에서 사용
-- EXPR로 명시한 표현식을 기준으로 집계한 결과, 추가 정보 집계
-- EXPR로 명시한 표현식 수와 순서에 따라 레벨 별로 집계

-- 부서별, 직무별, 급여의 합(부서코드가 바뀔 때마다 부서별 집계가 출력되고 모든 부서가 출력되면 전체 집계정보가 출력됨.
SELECT department_id, job_id, COUNT(*), SUM(salary)
FROM EMPLOYEES
GROUP BY ROLLUP(department_id ,job_id)
ORDER BY department_id;

-- JOB_ID, DEPARTMENT_ID 위치 바꿈
SELECT job_id, department_id,  COUNT(*), SUM(salary)
FROM EMPLOYEES
GROUP BY ROLLUP(job_id, department_id )
ORDER BY job_id;


-- CUBE(EXP1, EXP2)
-- CUBE 는 명시한 표현식 갯수에 따라 가능한 모든 조합별로 집계한 결과를 반환한다.
-- ROLLUP을 한 번 더 실행해 아래에 붙여준다

SELECT department_id, job_id, COUNT(*), SUM(salary)
FROM EMPLOYEES
GROUP BY CUBE(department_id ,job_id)
ORDER BY department_id;