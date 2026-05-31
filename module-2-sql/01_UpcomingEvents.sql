
-- 01: Displays all upcoming events that a user has registered for in their own city.

SELECT
    e.event_id,
    u.full_name,
    e.title,
    e.city,
    e.start_date
FROM Registrations r
JOIN Users u
    ON r.user_id = u.user_id
JOIN Events e
    ON r.event_id = e.event_id
WHERE e.status = 'upcoming'
    AND u.city = e.city
ORDER BY e.start_date;