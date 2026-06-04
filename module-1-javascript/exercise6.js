let events = [];

events.push({
    name: "Music Fest",
    category: "Music",
    seats: 30
});

events.push({
    name: "Baking Workshop",
    category: "Workshop",
    seats: 20
});

events.push({
    name: "Football Match",
    category: "Sports",
    seats: 40
});

console.log("All Events:", events);

let musicEvents =
events.filter(event =>
    event.category === "Music"
);

console.log("Music Events:", musicEvents);

let formatted =
events.map(event =>
    `${event.name} - ${event.category}`
);

console.log("Formatted Events:", formatted);