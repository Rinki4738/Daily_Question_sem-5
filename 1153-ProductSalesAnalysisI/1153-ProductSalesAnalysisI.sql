-- Last updated: 8/14/2025, 3:43:56 PM
# Write your MySQL query statement below
select product_name,year,price from sales inner join product
on sales.product_id=product.product_id;
