function Event(
    name,
    category,
    date,
    seats
) {

    this.name = name;
    this.category = category;
    this.date = date;
    this.seats = seats;
}

Event.prototype.checkAvailability =
function () {

    return this.seats > 0;
};

const event1 =
new Event(
    "Music Fest",
    "Music",
    "15-July-2026",
    50
);

console.log(
    "Availability: "
    + event1.checkAvailability()
);

console.log(
    "Object Entries"
);

Object.entries(event1)
.forEach(([key, value]) => {

    console.log(
        key + " : " + value
    );
});