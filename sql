Find the 3rd largest salary in SQL.

select distinct salary from emp
order by salary desc
limit 1 offset 2;

How it works

DISTINCT → removes duplicate salaries

ORDER BY salary DESC → highest first

OFFSET 2 → skips 1st & 2nd

LIMIT 1 → returns 3rd highest

✔ Works when duplicates exist
-------------------------------------------
