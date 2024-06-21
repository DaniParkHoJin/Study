SELECT MAX(salary + NVL2(commission_pct, salary * commission_pct / 100, 0)) AS MAX,
        MIN(salary + NVL2(commission_pct, salary * commission_pct / 100, 0))AS MIN,
        ROUND(AVG(salary + NVL2(commission_pct, salary * commission_pct / 100, 0)), 1) AS AVG
FROM EMPLOYEES;

SELECT TO_CHAR(hire_date, 'YYYY') AS H_YEAR,
        COUNT(*) AS �����,
        MIN(salary) AS �ּұ޿�,
        MAX(salary) AS �ִ�޿�,
        ROUND(AVG(salary), 2) AS "�޿��� ���",
        SUM(salary) AS "�޿��� ��"
FROM EMPLOYEES
GROUP BY TO_CHAR(hire_date, 'YYYY')
ORDER BY TO_CHAR(hire_date, 'YYYY');

SELECT COUNT(*) AS TOTAL,
    COUNT(CASE WHEN TO_CHAR(hire_date, 'YYYY') = '2001' THEN 1 END) AS "2001��",
    COUNT(CASE WHEN TO_CHAR(hire_date, 'YYYY') = '2002' THEN 1 END) AS "2002��",
    COUNT(CASE WHEN TO_CHAR(hire_date, 'YYYY') = '2003' THEN 1 END) AS "2003��",
    COUNT(CASE WHEN TO_CHAR(hire_date, 'YYYY') = '2004' THEN 1 END) AS "2004��",
    COUNT(CASE WHEN TO_CHAR(hire_date, 'YYYY') = '2005' THEN 1 END) AS "2005��",
    COUNT(CASE WHEN TO_CHAR(hire_date, 'YYYY') = '2006' THEN 1 END) AS "2006��",
    COUNT(CASE WHEN TO_CHAR(hire_date, 'YYYY') = '2007' THEN 1 END) AS "2007��",
    COUNT(CASE WHEN TO_CHAR(hire_date, 'YYYY') = '2008' THEN 1 END) AS "2008��"
FROM EMPLOYEES;

SELECT job_id,
        SUM(DECODE(department_id, 10, salary, 0)) AS "DEPTNO 10",
        SUM(DECODE(department_id, 20, salary, 0)) AS "DEPTNO 20",
        SUM(DECODE(department_id, 30, salary, 0)) AS "DEPTNO 30",
        SUM(DECODE(department_id, 40, salary, 0)) AS "DEPTNO 40",
        SUM(DECODE(department_id, 50, salary, 0)) AS "DEPTNO 50",
        SUM(DECODE(department_id, 60, salary, 0)) AS "DEPTNO 60",
        SUM(DECODE(department_id, 70, salary, 0)) AS "DEPTNO 70",
        SUM(DECODE(department_id, 80, salary, 0)) AS "DEPTNO 80",
        SUM(DECODE(department_id, 90, salary, 0)) AS "DEPTNO 90",
        SUM(DECODE(department_id, 100, salary, 0)) AS "DEPTNO 100",
        SUM(DECODE(department_id, 110, salary, 0)) AS "DEPTNO 110"
FROM EMPLOYEES
GROUP BY job_id;


SELECT department_id,
            TO_CHAR(SUM(salary), '$999,999.00') AS "�޿� �հ�",
            TO_CHAR(ROUND(AVG(salary),2), '$999,999.00') AS "�޿� ���",
            TO_CHAR(MAX(salary), '$999,999.00') AS "�޿� �ִ밪",
            TO_CHAR(MIN(salary), '$999,999.00') AS "�޿� �ּҰ�"
FROM EMPLOYEES
WHERE department_id IS NOT NULL
GROUP BY department_id
--HAVING department_id IS NOT NULL
ORDER BY department_id;

SELECT job_id, avg(salary) AS "Avg Salary"
FROM EMPLOYEES
WHERE job_id NOT like '%CLERK%' 
group by job_id
HAVING avg(salary) > 10000
ORDER BY AVG(salary) DESC;