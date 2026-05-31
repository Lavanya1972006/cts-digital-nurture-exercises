
-- 22: Detects duplicate registrations where the same user registered multiple times for an event.

SELECT user_id, event_id,
       COUNT(*) AS registration_count
FROM   Registrations
GROUP  BY user_id, event_id
HAVING COUNT(*) > 1;