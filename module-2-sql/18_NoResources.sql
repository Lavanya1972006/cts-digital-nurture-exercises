
-- 18: Lists events that do not have any resources uploaded.

SELECT e.event_id, e.title, e.status
FROM   Events e
WHERE  e.event_id NOT IN (
    SELECT DISTINCT event_id FROM Resources
);