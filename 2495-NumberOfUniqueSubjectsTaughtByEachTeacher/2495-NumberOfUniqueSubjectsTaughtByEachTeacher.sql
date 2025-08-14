-- Last updated: 8/14/2025, 3:41:59 PM
# Write your MySQL query statement below
select teacher_id ,count(distinct(subject_id)) as cnt from teacher
group by teacher_id; 