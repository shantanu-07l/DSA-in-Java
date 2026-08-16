# Write your MySQL query statement below
SELECT max(salary)  As SecondHighestSalary
FROM Employee
WHERE salary < (SELECT MAX(salary) FROM Employee );
