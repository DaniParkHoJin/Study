select employee_id, last_name||' '||first_name as Name, salary,
    round(salary * 1.123, 0) as "increased Salary"
from employees
where department_id = 60;



select initcap(last_name)||' '||initcap(first_name)|| ' is a '|| upper(job_id) as "Employee JOBs"
from employees
where substr(last_name, -1, 1) = 's';


select concat(last_name,first_name) as Name, salary, commission_pct,
          (12 * salary + salary * nvl2(commission_pct, commission_pct / 10, 0)) as "Salary + Commission"  
--        salary + salary * nvl2(commission_pct, commission_pct / 10, 0) as "Salary + Commission",
--        salary + 12 as "Salary only"
from employees;


select concat(last_name,first_name) as Name, hire_date, to_char(hire_date, 'DAY')
from employees
order by to_char(hire_date, 'd');

select last_name||' '|| first_name as Name, employee_id, to_char(hire_date, 'DL')
from employees
where hire_date BETWEEN to_date('2006/05/20', 'YYYY/MM/DD') and to_date('2007/05/20', 'YYYY/MM/DD')
order by hire_date asc;


