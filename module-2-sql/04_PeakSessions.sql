
-- 04: Counts the number of sessions scheduled between 10:00 AM and 12:00 PM for each event.

SELECT 
    e.event_id,
    e.title,
    COUNT(s.session_id) AS sessions_in_peak
FROM Events e
JOIN Sessions s
    ON s.event_id = e.event_id
WHERE TIME(s.start_time) >= '10:00:00'
  AND TIME(s.start_time) < '12:00:00'
GROUP BY e.event_id, e.title
ORDER BY sessions_in_peak DESC;