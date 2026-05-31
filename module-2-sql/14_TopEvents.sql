
-- 14: Lists the top 3 events with the highest registration counts.

SELECT e.event_id, e.title,
       COUNT(r.registration_id) AS total_registrations
FROM   Events e
JOIN   Registrations r ON r.event_id = e.event_id
GROUP  BY e.event_id, e.title
ORDER  BY total_registrations DESC
LIMIT  3;