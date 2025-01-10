-- 코드를 입력하세요
-- USER_ID와 PRODUCT_ID 재구매 했을 시 출력

SELECT USER_ID, PRODUCT_ID FROM ONLINE_SALE
WHERE USER_ID
GROUP BY USER_ID, PRODUCT_ID 
HAVING COUNT(PRODUCT_ID) > 1 
ORDER BY USER_ID ASC, PRODUCT_ID DESC