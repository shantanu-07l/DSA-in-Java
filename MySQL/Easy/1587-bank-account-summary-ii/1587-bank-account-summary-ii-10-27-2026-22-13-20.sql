# Write your MySQL query statement below
SELECT name,SUM(t.amount) as balance
FROM USERS u
JOIN TRANSACTIONS t
on u.account=t.account
GROUP BY t.account
HAVING balance > 10000;