-- �Ϲ��Լ�
-- NVL ù ��° ���ڷ� ���� ���� NULL�� ������ �� ��° ���� ������ ����
-- DECOUDE ù ��° ���ڷ� ���� ���� ���ǿ� ���� ����(IF �� ����)
-- CASE �ʰǿ� �´� ������ �����Ѵ�.

-- NVL(�÷� �Ǵ� ǥ����, ��ü��) NULL�� 0 �Ǵ� �ٸ� ������ ��ȯ�ϱ� ���ؼ� �����
SELECT first_name, salary, commission_pct, job_id
FROM EMPLOYEES
ORDER BY JOB_ID;

SELECT first_name, salary, NVL(commission_pct, 0),job_id
FROM EMPLOYEES
ORDER BY job_id;

--NVL2(�÷� �Ǵ� ǥ����, NULL���� �ƴϸ� ó���� ����, NULL���̸� ó���� ����)
-- Ŀ�̼��� NULL�� �ƴϸ� �޿� + Ŀ�̼���, NULL�̸� �޿��� ���
SELECT first_name, salary, commission_pct,
NVL2(commission_pct, salary + (salary*NVL(commission_pct, 0 )), salary) TOTAL_SAL
FROM EMPLOYEES;

-- NULLIF(ǥ����1, ǥ����2) �� ǥ������ ���Ͽ� ������ ��쿡�� NULL�� ��ȯ, �������� ������ ù��° ǥ������ ��ȯ�Ѵ�.
SELECT NULLIF('A', 'A'), NULLIF('A', 'B')
FROM DUAL;

-- DECODE(ǥ����, ����1, ���1, ����2, ���2, ����3, ���3, ... ������ �� ������ ���N)
-- �μ��� ���ϱ�
SELECT department_id, DECODE(department_id, 10, 'Administration', 20, 'Markecting', 30, 
'Puchasion', 40, 'Human resources', 50, 'Shipping', 60, 'It') as DEPARTMENTS
FROM EMPLOYEES
ORDER BY department_id;

-- ���ǿ� ���� ���� �ٸ� ó���� ������ CASE �Լ�
-- CASE WHEN ����1 THEN ���1
--      WHEN ����2 THEN ���2
--      WHEN ����3 THEN ���3
--      ELSE ���n
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

-- GREATEST(exp1, exp2 ...)���� ū ���� ��ȯ�ϴ� �Լ�, LEAST(exp1, exp2 ...)���� ���� ���� ��ȯ�ϴ� �Լ�
SELECT GREATEST(1,4,2,5,3,9), LEAST(1,4,2,5,3,9)
FROM DUAL;
