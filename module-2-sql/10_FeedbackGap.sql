
-- 10: Identifies events that received registrations but have no feedback records.

SELECT DISTINCT e.event_id, e.title
FROM   Events e
JOIN   Registrations r ON r.event_id = e.event_id
WHERE  e.event_id NOT IN (
    SELECT DISTINCT event_id FROM Feedback
);