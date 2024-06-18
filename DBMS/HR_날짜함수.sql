-- ��¥ �Լ�

-- SYSDATE ���� ��¥ ��ȯ(��/��/��)(YY/MM/DD) ��¥�� �����ʹ� ������ �����ϴ�.
SELECT SYSDATE
FROM DUAL;

-- MONTHS_BETWEEN(DATE1, DATE2) �� ��¥ ������ ���� ���Ѵ�.
-- �Ի��Ϸκ��� �� ���� �������� ���϶�.
SELECT first_name, SYSDATE AS ����, TO_CHAR(hire_date,'YYYY/MM/DD') AS �Ի���,
TRUNC(MONTHS_BETWEEN(SYSDATE, hire_date)) AS �ٹ��޼�
FROM EMPLOYEES
WHERE department_id = 30;

-- ADD_MONTHS(DATE, NUMBER) Ư�� �������� ���Ѵ�.
-- �Ի��Ͽ��� 3������ ���� ��¥�� ���϶�.
SELECT first_name, hire_date, ADD_MONTHS(hire_date, 3)
FROM EMPLOYEES
WHERE department_id = 30;

-- NEXT_DAY �ش� ���Ͽ��� ���� ����� ��¥�� ��ȯ�Ѵ�.
-- ������ �������� ���ʷ� �ٰ����� �������� �����ΰ�?
SELECT SYSDATE, NEXT_DAY(SYSDATE, '������')
FROM DUAL;
-- �������� '��'�� �����ϴ�. �Ͽ����� 1�μ� ���ڷε� �����ϴ�. ������� 7
SELECT SYSDATE, NEXT_DAY(SYSDATE, '��'), NEXT_DAY(SYSDATE, 1)
FROM DUAL;
-- ������ �پ��� ���� ���氡���ϴ�.
-- ALTER SESSION SET NLS_LANGUAGE = AMERICA;(�̱�) �ý��� ��ü�� ������ �����Ѵ�.
-- ALTER SESSION SET NLS_LANGUAGE = KOREAN;(�ѱ�)
-- ALTER SESSION SET NLS_LANGUAGE = JAPANESE;(�Ϻ�)

-- LAST_DAY(SYSDATE) �ش� ���� ������ ��¥�� ��ȯ�Ѵ�.
SELECT SYSDATE, LAST_DAY(SYSDATE)
FROM DUAL;

-- ��¥�� ������ �����ϹǷ� ROUND �Լ��� �پ��ϰ� �ݿø��� �� �ִ�. FORMAT ���� �˻��ʿ�.
-- �Ի����� �� �������� �ݿø� �ض�.
SELECT hire_date, ROUND(hire_date, 'MONTH')
FROM EMPLOYEES;

-- ��¥�� ������ �����ϹǷ� TRUNC �Լ��� �پ��ϰ� �߶� �� �ִ�. ROUND �� �ݴ밡 ��.
SELECT hire_date, TRUNC(hire_date, 'MONTH')
FROM EMPLOYEES;