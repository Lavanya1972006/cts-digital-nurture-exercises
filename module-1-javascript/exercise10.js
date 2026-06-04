const events = [
    {
        name: "Music Fest",
        category: "Music",
        seats: 50
    },
    {
        name: "Workshop",
        category: "Learning",
        seats: 30
    }
];

// Default parameter + destructuring
function showEvent(event = events[0]) {

    const { name, category, seats } = event;

    console.log("Event Name:", name);
    console.log("Category:", category);
    console.log("Seats:", seats);
}

showEvent();

// Spread operator
const copiedEvents = [...events];

console.log("Copied Events:", copiedEvents);