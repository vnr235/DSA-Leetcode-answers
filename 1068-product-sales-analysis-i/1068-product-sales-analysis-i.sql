# Write your MySQL query statement below
select v.product_name, n.year, n.price from product v JOIN sales n on v.product_id = n.product_id ;