# Write your MySQL query statement below
SELECT DISTINCT a.*
FROM stadium a
JOIN stadium b
JOIN stadium c
  ON (
       (a.id = b.id - 1 AND b.id = c.id - 1)   -- a,b,c consecutive: a is first
    OR (a.id = b.id + 1 AND a.id = c.id - 1)   -- a is the middle
    OR (a.id = b.id + 1 AND b.id = c.id + 1)   -- a is last
  )
WHERE a.people >= 100
  AND b.people >= 100
  AND c.people >= 100
ORDER BY a.id;