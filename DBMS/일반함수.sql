-- 일반함수
-- NVL 첫 번째 인자로 받은 값이 NULL과 같으면 두 번째 인자 값으로 변경
-- DECOUDE 첫 번째 인자로 받은 값을 조건에 맞춰 변경(IF 와 유사)
-- CASE 초건에 맞는 문장을 수정한다.

-- NVL(컬럼 또는 표현식, 대체값) NULL을 0 또는 다른 값으로 변환하기 위해서 사용함
SELECT first_name, salary, commission_pct, job_id
FROM EMPLOYEES
ORDER BY JOB_ID;

SELECT first_name, salary, NVL(commission_pct, 0),job_id
FROM EMPLOYEES
ORDER BY job_id;

--NVL2(컬럽 또는 표현식, NULL값이 아니면 처리할 구문, NULL값이면 처리할 구문)
-- 커미션이 NULL이 아니면 급여 + 커미션을, NULL이면 급여만 출력
SELECT first_name, salary, commission_pct,
NVL2(commission_pct, salary + (salary*NVL(commission_pct, 0 )), salary) TOTAL_SAL
FROM EMPLOYEES;

-- NULLIF(표현식1, 표현식2) 두 표현식을 비교하여 동일한 경우에는 NULL을 반환, 동일하지 않으면 첫번째 표현식을 반환한다.
SELECT NULLIF('A', 'A'), NULLIF('A', 'B')
FROM DUAL;

-- DECODE(표현식, 조건1, 결과1, 조건2, 결과2, 조건3, 결과3, ... 조건절 외 나머지 결과N)
-- 부서명 구하기
SELECT department_id, DECODE(department_id, 10, 'Administration', 20, 'Markecting', 30, 
'Puchasion', 40, 'Human resources', 50, 'Shipping', 60, 'It') as DEPARTMENTS
FROM EMPLOYEES
ORDER BY department_id;

-- 조건에 따라 서로 다른 처리가 가능한 CASE 함수
-- CASE WHEN 조건1 THEN 결과1
--      WHEN 조건2 THEN 결과2
--      WHEN 조건3 THEN 결과3
--      ELSE 결과n
-- END

SELECT first_name, department_id,
        CASE WHEN department_id = 10 THEN 'Administration'
             WHEN department_id = 20 THEN 'Marketing'
             WHEN department_id = 30 THEN 'Purchasing'
             WHEN department_id = 40 THEN 'Human Resources'
             WHEN department_id = 50 THEN 'Shipping'
             WHEN department_id = 60 THEN 'IT'
    END department_name
FROM EMPLOYEES
ORDER BY DEPARTMENT_ID;

-- GREATEST(exp1, exp2 ...)가장 큰 값을 반환하는 함수, LEAST(exp1, exp2 ...)가장 작은 값을 반환하는 함수
SELECT GREATEST(1,4,2,5,3,9), LEAST(1,4,2,5,3,9)
FROM DUAL;
