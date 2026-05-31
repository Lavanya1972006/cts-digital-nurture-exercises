
-- 24: Calculates the average session duration in minutes for each event.

SELECT e.event_id, e.title,
       ROUND(AVG(TIMESTAMPDIFF(MINUTE, s.start_time, s.end_time)), 1)
         AS avg_duration_minutes
FROM   Events e
JOIN   Sessions s ON s.event_id = e.event_id
GROUP  BY e.event_id, e.title;