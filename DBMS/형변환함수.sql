-- 형변환 함수

-- 자료형을 변환시키고자 할 때 사용함.
-- TO_CHAR : 날짜형, 숫자형 -> 문자형
-- TO_DATE : 문자형 -> 날짜형
-- TO_NUMBER : 문자형 -> 숫자형

-- TO_CHAR(날짜 데이터, '출력형식') 출력형식 검색 필요
SELECT SYSDATE, TO_CHAR(SYSDATE, 'YYYY-MM-DD'), TO_CHAR(SYSDATE, 'DL')
FROM DUAL;
-- 직원들의 입사일을 출력하되 요일까지 함께 출력하라.
SELECT TO_CHAR(hire_date, 'YYYY/MM/DD DAY')
FROM EMPLOYEES;
-- 형식을 YYYY년 MM월 DD일로 변경해라
SELECT TO_CHAR(hire_date, 'YYYY"년" MM"월" DD"일" DAY')
FROM EMPLOYEES;
-- 시간 출력 형식
SELECT TO_CHAR(SYSDATE, 'YYYY/MM/DD HH24:MI:SS')
FROM DUAL;

-- TO_CHAR(숫자, '출력형식') 숫자형을 문자형으로 변환하기
-- 0은 자릿수가 맞지 않을 때 0으로 채움
-- 9는 자릿수가 맞지 않을 때 채우지 않음
-- L은 각 기역별 통화 기호를 앞에 표시함
-- . 소숫점
-- , 천 단위 자리 구분

-- 직원들의 월급을 $999,999 형식으로 출력하라
SELECT first_name, salary, TO_CHAR(salary, '$999,999')
FROM EMPLOYEES;
-- 변형
SELECT first_name, salary, TO_CHAR(salary, '999,999,999')
FROM EMPLOYEES;

--  TO_DATE(문자, '출력형식' ) 날짜형으로 변환하는 함수
SELECT first_name, hire_date
FROM employees
WHERE hire_date = TO_DATE(20051224, 'YYYYMMDD');
