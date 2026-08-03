# Write your MySQL query statement below
select Customers .name as Customers  from Customers  left join orders on Customers .id = orders.Customerid where orders.customerid is null;