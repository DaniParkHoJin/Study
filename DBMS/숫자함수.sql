-- 그룹함수
-- 숫자함수
-- sum, avg, max, min, count

-- SUM 그룹의 누적 합계를 반환한다.
-- 직원의 총급여 구하기
SELECT sum(SALARY)
FROM employees;
-- 총 급여 출력 형태를 바꾼다.
SELECT to_char(sum(SALARY), '$999,9999') as total
FROM employees;

-- avg 평균을 반환한다.
-- 직원의 평균 급여 구하기
SELECT avg(SALARY)
FROM employees;
-- 평균 급여를 반올림해 출력한다.
SELECT  round(avg(SALARY),1)
FROM employees;

