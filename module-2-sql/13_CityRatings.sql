
-- 13: Calculates the average feedback rating for events conducted in each city.

SELECT e.city,
       ROUND(AVG(f.rating), 2) AS avg_rating,
       COUNT(f.feedback_id)    AS feedback_count
FROM   Events e
JOIN   Feedback f ON f.event_id = e.event_id
GROUP  BY e.city
ORDER  BY avg_rating DESC;