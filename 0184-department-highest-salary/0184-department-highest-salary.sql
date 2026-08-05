# Write your MySQL query statement below
select d.name as Department  , e.name as Employee  , e.salary as Salary  from employee e join department d on e.departmentid = d.id
join (select departmentid , max(salary) as max_salary from employee group by departmentid ) m
on e.departmentid = m.departmentid and e.salary = m.max_salary;