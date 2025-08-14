-- Last updated: 8/14/2025, 3:43:49 PM
# Write your MySQL query statement below
select distinct author_id as id from views where author_id=viewer_id order by id;