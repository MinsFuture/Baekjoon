select count(*) as USER
from USER_INFO
where YEAR(JOINED) = '2021' and 20 <= AGE and AGE <= 29
