# Write your MySQL query statement below
SELECT product_name,SUM(unit) AS unit# to need count then sum  also make sure otput column name what need then use AS
FROM Products As p
INNER JOIN Orders AS o  # inner join for all product need from both tabel
ON p.product_id = o.product_id
WHERE o.order_date>='2020-02-01' AND o.order_date<'2020-03-01'  # to comapre id use where
GROUP BY p.product_id,p.product_name #Group by if 2 or more use , not ANS
HAVING SUM(o.unit) >=100; #for havig always use agrregation fuction 

