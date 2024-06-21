-- ���� �� �Լ��� �׷� �� �Լ��� �Բ� ����� �� ����. ���� �� �Լ��� ���� �������� �׷� �� �Լ��� �� �ุ ���´�.

-- SUM : �׷��� ���� �հ踦
-- AVG : �׷��� ����� ��ȯ
-- MAX : �׷��� �ִ��� ��ȯ
-- MIN : �׷��� �ּڰ��� ��ȯ
-- COUNT : �׷��� �� ������ ��ȯ

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

-- �ֱٿ� �Ի��� ����� ���� ���� ���� �Ի��� ����� �Ի��� ����ϱ�(MAX/MIN �Լ�)
SELECT TO_CHAR(MAX(hire_date),'YYYY-MM-DD'), TO_CHAR(MIN(hire_date),'YYYY-MM-DD')
FROM EMPLOYEES;

-- JOB�� ������ �� ������? ��, �ߺ����� ���� ������ ������ ���ض�.
SELECT COUNT(DISTINCT(Job_id))
FROM EMPLOYEES;

-- GROUP BY
-- �Ϲ������� ���������κ��� ���� ����� ���� GROUP BY ���� ����� Į���� ���� ���� �� �׷��� �����
-- �� �׷����κ��� SQL ǥ�� �Լ��� �׷� �Լ��� ���� �پ��� ����� ��´�.
-- Ư�� �׷����� ���� ������ ���� �� ���,
-- WHERE �� ORDER BY ���̿� ��ġ
-- ����(�׷�)�Լ��� �Բ� ���
-- **** SELECT ����Ʈ���� ���� �Լ��� ������ ��� �÷��� ǥ������ GROUP BY �� ����ؾ���. ������ Į�����̾�� �Ѵ�.

-- SELECT Į����1, �׷��Լ�(�÷���)
-- FROM ���̺��
-- WHERE ���ǹ�
-- GROUP BY Į����1

-- ������� �μ� ��ȣ �������� �׷�ȭ�ϰ� ������������ ����
SELECT department_id
FROM EMPLOYEES
GROUP BY department_id
ORDER BY department_id ASC;

-- �μ��� �ִ� �޿��� �ּұ޿� ���ϱ�
SELECT department_id, MAX(salary), MIN(SALARY)
FROM EMPLOYEES
GROUP BY department_id
ORDER BY department_id;

-- �Ҽ� �μ��� �޿��� �հ� �޿��� ��� ���ϱ�(����� �ݿø� �ʿ�)
SELECT department_id, SUM(salary), ROUND(AVG(SALARY),1)
FROM EMPLOYEES
GROUP BY department_id
ORDER BY department_id;


-- HAVING ����
-- SELECT �� ������ ����Ͽ� ����� ������ ���� WHERE �� ���������, �׷��� ����� ������ �� ���� HAVING �� ����Ѵ�
-- GROUP BY ������ ��ġ�� GROUP BY �� ����� ������� �ٽ� ���͸� �Ŵ� ����
-- HAVING �������� SELECT ����Ʈ�� ����ߴ� ���� �Լ��� �̿��� ������ ���

SELECT department_id, AVG(salary)
FROM EMPLOYEES
GROUP BY department_id
ORDER BY department_id;

-- ����(�޿� ����� 5000�̻��� �͸�)
SELECT department_id, AVG(salary)
FROM EMPLOYEES
GROUP BY department_id
HAVING AVG(salary)>= 5000
ORDER BY department_id;

-- ����(�޿� �ִ밪�� 5000 �̻��� �͸�(10�� �μ��� ���ܵ�)
SELECT department_id, MAX(salary), MIN(salary)
FROM EMPLOYEES
GROUP BY department_id
HAVING MAX(salary) > 5000
ORDER BY department_id;


-- ROLLUP(EXPR1, EXPR2)
-- GROUP BY ���� ���
-- EXPR�� ����� ǥ������ �������� ������ ���, �߰� ���� ����
-- EXPR�� ����� ǥ���� ���� ������ ���� ���� ���� ����

-- �μ���, ������, �޿��� ��(�μ��ڵ尡 �ٲ� ������ �μ��� ���谡 ��µǰ� ��� �μ��� ��µǸ� ��ü ���������� ��µ�.
SELECT department_id, job_id, COUNT(*), SUM(salary)
FROM EMPLOYEES
GROUP BY ROLLUP(department_id ,job_id)
ORDER BY department_id;

-- JOB_ID, DEPARTMENT_ID ��ġ �ٲ�
SELECT job_id, department_id,  COUNT(*), SUM(salary)
FROM EMPLOYEES
GROUP BY ROLLUP(job_id, department_id )
ORDER BY job_id;


-- CUBE(EXP1, EXP2)
-- CUBE �� ����� ǥ���� ������ ���� ������ ��� ���պ��� ������ ����� ��ȯ�Ѵ�.
-- ROLLUP�� �� �� �� ������ �Ʒ��� �ٿ��ش�

SELECT department_id, job_id, COUNT(*), SUM(salary)
FROM EMPLOYEES
GROUP BY CUBE(department_id ,job_id)
ORDER BY department_id;