-- 날짜 함수

-- SYSDATE 현재 날짜 반환(년/월/일)(YY/MM/DD) 날짜형 데이터는 연산이 가능하다.
SELECT SYSDATE
FROM DUAL;

-- MONTHS_BETWEEN(DATE1, DATE2) 두 날짜 사이의 달을 구한다.
-- 입사일로부터 몇 달이 지났는지 구하라.
SELECT first_name, SYSDATE AS 오늘, TO_CHAR(hire_date,'YYYY/MM/DD') AS 입사일,
TRUNC(MONTHS_BETWEEN(SYSDATE, hire_date)) AS 근무달수
FROM EMPLOYEES
WHERE department_id = 30;

-- ADD_MONTHS(DATE, NUMBER) 특정 개월수를 더한다.
-- 입사일에서 3개월이 지난 날짜를 구하라.
SELECT first_name, hire_date, ADD_MONTHS(hire_date, 3)
FROM EMPLOYEES
WHERE department_id = 30;

-- NEXT_DAY 해당 요일에서 가장 가까운 날짜를 반환한다.
-- 오늘을 기준으로 최초로 다가오는 수요일은 언제인가?
SELECT SYSDATE, NEXT_DAY(SYSDATE, '수요일')
FROM DUAL;
-- 수요일은 '수'로 가능하다. 일요일이 1로서 숫자로도 가능하다. 토요일은 7
SELECT SYSDATE, NEXT_DAY(SYSDATE, '일'), NEXT_DAY(SYSDATE, 1)
FROM DUAL;
-- 요일은 다양한 언어로 변경가능하다.
-- ALTER SESSION SET NLS_LANGUAGE = AMERICA;(미국) 시스템 자체의 설정을 변경한다.
-- ALTER SESSION SET NLS_LANGUAGE = KOREAN;(한국)
-- ALTER SESSION SET NLS_LANGUAGE = JAPANESE;(일본)

-- LAST_DAY(SYSDATE) 해당 달의 마지막 날짜를 반환한다.
SELECT SYSDATE, LAST_DAY(SYSDATE)
FROM DUAL;

-- 날짜는 연산이 가능하므로 ROUND 함수로 다양하게 반올림할 수 있다. FORMAT 형식 검색필요.
-- 입사일을 달 기준으로 반올림 해라.
SELECT hire_date, ROUND(hire_date, 'MONTH')
FROM EMPLOYEES;

-- 날짜는 연산이 가능하므로 TRUNC 함수로 다양하게 잘라낼 수 있다. ROUND 와 반대가 됨.
SELECT hire_date, TRUNC(hire_date, 'MONTH')
FROM EMPLOYEES;