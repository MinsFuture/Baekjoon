-- 코드를 입력하세요
SELECT T1.FOOD_TYPE AS FOOD_TYPE, 
       T1.REST_ID AS REST_ID, 
       T1.REST_NAME AS REST_NAME, 
       T2.FAVORITES AS FAVORITES
FROM REST_INFO AS T1
JOIN (SELECT FOOD_TYPE, MAX(FAVORITES) AS FAVORITES 
      FROM REST_INFO 
      GROUP BY FOOD_TYPE) AS T2 
ON T1.FOOD_TYPE = T2.FOOD_TYPE AND T1.FAVORITES = T2.FAVORITES
ORDER BY T1.FOOD_TYPE DESC;