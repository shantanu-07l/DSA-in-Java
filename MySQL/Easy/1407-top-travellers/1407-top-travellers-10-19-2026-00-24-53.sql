# Write your MySQL query statement below
SELECT name,IFNULL(SUM(distance),0) AS travelled_distance # if diastance null then it 0
FROM Users
LEFT JOIN Rides
ON Users.id =Rides.user_id
GROUP BY Users.id
ORDER BY travelled_distance DESC,Users.name ASC; # when use first desc then need to define secound what becuse then it auto take desc  # also we use AS then no need to write Rides.diastance use simple trick 

