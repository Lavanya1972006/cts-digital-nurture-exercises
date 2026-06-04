const eventName = "Music Fest";
const eventDate = "15-July-2026";

let seats = 50;

let details =
`${eventName}
Date: ${eventDate}
Seats: ${seats}`;

document.getElementById("output")
.innerHTML = details;

console.log(details);

seats--;

console.log(
    "Seat booked. Remaining seats: "
    + seats
);

seats++;

console.log(
    "Seat restored. Available seats: "
    + seats
);