-- Last updated: 8/14/2025, 3:45:23 PM
# Write your MySQL query statement below
select class from courses
group by class
having count(student)>=5;