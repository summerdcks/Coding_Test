-- 코드를 입력하세요
SELECT ANIMAL_TYPE, COUNT(ANIMAL_TYPE) AS 'count'
FROM ANIMAL_INS 
GROUP BY ANIMAL_TYPE
ORDER BY ANIMAL_TYPE