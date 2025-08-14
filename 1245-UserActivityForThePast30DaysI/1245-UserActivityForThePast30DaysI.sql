-- Last updated: 8/14/2025, 3:43:53 PM
# Write your MySQL query statement below
select activity_date as day ,count(distinct user_id) as active_users from activity where activity_date>"2019-06-27" && activity_date<="2019-07-27" group by activity_date;