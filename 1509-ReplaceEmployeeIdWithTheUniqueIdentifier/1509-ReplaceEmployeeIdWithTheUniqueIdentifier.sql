-- Last updated: 8/14/2025, 3:43:34 PM
# Write your MySQL query statement below
select  unique_id,name from Employees Left join EmployeeUNI
on Employees.id=EmployeeUNI.id;
