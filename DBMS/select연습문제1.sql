SELECT employee_id, first_name||' '||last_name as Name, salary, job_id, hire_date, manager_id
from employees;

select first_name||last_name as Name,
        job_id as Job, salary as Salary,
        salary*12+100 as "Increased Ann_Salary",
        12*(salary+100) as "Increased Salary"
from employees;

select last_name||': 1 Year Salary = $'||salary*12 as "1 Year Salary"
from employees;

select Distinct department_id, job_id
from employees
where department_id is not null
order by department_id;

select first_name||last_name as Name, salary
from employees
where not salary BETWEEN 7000 and 10000
order by salary asc;

select last_name as "e and o Name"
from employees
where last_name like '%e%'
AND last_name like '%o%';

select first_name||last_name as Name, employee_id, hire_date
from employees
where hire_date BETWEEN '2006/05/20' AND '2007/05/20'
order by hire_date asc;

select first_name||''||last_name as Name, salary, job_id, commission_pct
from employees
where commission_pct is not null
order by salary DESC, commission_pct DESC;
