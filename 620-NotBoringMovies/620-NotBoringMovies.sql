-- Last updated: 8/14/2025, 3:45:18 PM
# Write your MySQL query statement below
select * from cinema where id%2!='0' && description !="boring"  order by rating desc;