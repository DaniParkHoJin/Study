-- ����ȯ �Լ�

-- �ڷ����� ��ȯ��Ű���� �� �� �����.
-- TO_CHAR : ��¥��, ������ -> ������
-- TO_DATE : ������ -> ��¥��
-- TO_NUMBER : ������ -> ������

-- TO_CHAR(��¥ ������, '�������') ������� �˻� �ʿ�
SELECT SYSDATE, TO_CHAR(SYSDATE, 'YYYY-MM-DD'), TO_CHAR(SYSDATE, 'DL')
FROM DUAL;
-- �������� �Ի����� ����ϵ� ���ϱ��� �Բ� ����϶�.
SELECT TO_CHAR(hire_date, 'YYYY/MM/DD DAY')
FROM EMPLOYEES;
-- ������ YYYY�� MM�� DD�Ϸ� �����ض�
SELECT TO_CHAR(hire_date, 'YYYY"��" MM"��" DD"��" DAY')
FROM EMPLOYEES;
-- �ð� ��� ����
SELECT TO_CHAR(SYSDATE, 'YYYY/MM/DD HH24:MI:SS')
FROM DUAL;

-- TO_CHAR(����, '�������') �������� ���������� ��ȯ�ϱ�
-- 0�� �ڸ����� ���� ���� �� 0���� ä��
-- 9�� �ڸ����� ���� ���� �� ä���� ����
-- L�� �� �⿪�� ��ȭ ��ȣ�� �տ� ǥ����
-- . �Ҽ���
-- , õ ���� �ڸ� ����

-- �������� ������ $999,999 �������� ����϶�
SELECT first_name, salary, TO_CHAR(salary, '$999,999')
FROM EMPLOYEES;
-- ����
SELECT first_name, salary, TO_CHAR(salary, '999,999,999')
FROM EMPLOYEES;

--  TO_DATE(����, '�������' ) ��¥������ ��ȯ�ϴ� �Լ�
SELECT first_name, hire_date
FROM employees
WHERE hire_date = TO_DATE(20051224, 'YYYYMMDD');
