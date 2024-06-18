SELECT last_name||' '||first_name AS Name, salary, job_id,
    CASE WHEN job_id like '%MGR%' AND  hire_date < to_date('20050101', 'yyyymmdd') then salary*1.15
                WHEN job_id like '%MAN%' AND  hire_date < to_date('20050101', 'yyyymmdd') then salary*1.20
                WHEN job_id like '%MGR%' AND  hire_date > to_date('20041231', 'yyyymmdd') then salary*1.25
                ELSE salary
                END AS upsalary
FROM employees
WHERE hire_date < to_date('20050101', 'yyyymmdd');
 



select last_name||' '||first_name as Name, salary, job_id,
    case when hire_date < to_date('20050101', 'yyyymmdd') and  job_id like '%MGR%' then salary*1.15
                when hire_date < to_date('20050101', 'yyyymmdd') and  job_id like '%MAN%' then salary*1.20
                when hire_date > to_date('20041231', 'yyyymmdd') and  job_id like '%MGR%' then salary*1.25
                else salary
                end as upsalary
from employees;