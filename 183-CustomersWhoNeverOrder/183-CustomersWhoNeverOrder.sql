-- Last updated: 8/14/2025, 3:47:24 PM
# Write your MySQL query statement below
select (name) as Customers
from Customers
where id not in (select customerId from orders);