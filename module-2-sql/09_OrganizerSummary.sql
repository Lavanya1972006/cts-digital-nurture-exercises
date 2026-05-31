
-- 09: Provides a summary of events created by each organizer and their statuses.

SELECT u.user_id, u.full_name,
       SUM(e.status = 'upcoming')   AS upcoming_count,
       SUM(e.status = 'completed')  AS completed_count,
       SUM(e.status = 'cancelled')  AS cancelled_count,
       COUNT(e.event_id)            AS total_events
FROM   Users u
JOIN   Events e ON e.organizer_id = u.user_id
GROUP  BY u.user_id, u.full_name;