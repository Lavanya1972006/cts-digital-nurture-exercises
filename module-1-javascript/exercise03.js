const events = [

    {
        name: "Music Fest",
        seats: 25,
        upcoming: true
    },

    {
        name: "Old Workshop",
        seats: 10,
        upcoming: false
    },

    {
        name: "Baking Workshop",
        seats: 0,
        upcoming: true
    }
];

console.log(
    "Available Upcoming Events"
);

events.forEach(event => {

    if (
        event.upcoming &&
        event.seats > 0
    ) {
        console.log(event.name);
    }

    else {
        console.log(
            event.name +
            " is hidden"
        );
    }
});

function register(event) {

    try {

        if (event.seats <= 0) {

            throw new Error(
                "No seats available"
            );
        }

        event.seats--;

        console.log(
            "Registration successful for "
            + event.name
        );

    }

    catch (error) {

        console.log(
            error.message
        );
    }
}

register(events[0]);
register(events[2]);