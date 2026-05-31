
-- 07: Lists users who gave low ratings and includes their comments and event details.

SELECT u.full_name, u.email,
       f.rating, f.comments,
       e.title AS event_title
FROM   Feedback f
JOIN   Users  u ON u.user_id  = f.user_id
JOIN   Events e ON e.event_id = f.event_id
WHERE  f.rating < 3
ORDER  BY f.rating;