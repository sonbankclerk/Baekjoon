-- 코드를 입력하세요
SELECT A.MEMBER_NAME, B.REVIEW_TEXT, TO_CHAR(B.REVIEW_DATE, 'YYYY-MM-DD') REVIEW_DATE
FROM MEMBER_PROFILE A, REST_REVIEW B
WHERE A.MEMBER_ID = B.MEMBER_ID
AND A.MEMBER_ID = (SELECT MEMBER_ID
                   FROM (
                        SELECT MEMBER_ID
                        FROM REST_REVIEW
                        GROUP BY MEMBER_ID
                        ORDER BY COUNT(*) DESC
                        )
                    WHERE ROWNUM = 1
                    )
ORDER BY REVIEW_DATE, B.REVIEW_TEXT