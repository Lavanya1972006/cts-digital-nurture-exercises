
-- 05: Shows the top 5 cities with the highest number of unique event registrations.

SELECT e.city,
       COUNT(DISTINCT r.user_id) AS distinct_registrations
FROM   Events e
JOIN   Registrations r ON r.event_id = e.event_id
GROUP  BY e.city
ORDER  BY distinct_registrations DESC
LIMIT  5;