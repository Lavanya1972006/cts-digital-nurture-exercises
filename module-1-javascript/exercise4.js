let events = [];

function addEvent(event) {

    events.push(event);

    console.log(
        event.name +
        " added successfully"
    );
}

function registerUser(userName) {

    console.log(
        userName +
        " registered"
    );
}

function filterEventsByCategory(
    category,
    callback
) {

    let result =
        events.filter(
            event =>
            event.category === category
        );

    callback(result);
}

function createRegistrationCounter() {

    let totalRegistrations = 0;

    return function () {

        totalRegistrations++;

        return totalRegistrations;
    };
}

const registrationCounter =
    createRegistrationCounter();

addEvent({
    name: "Music Fest",
    category: "Music"
});

addEvent({
    name: "Baking Workshop",
    category: "Workshop"
});

registerUser("Lavanya");

filterEventsByCategory(
    "Music",
    function (result) {

        console.log(
            "Filtered Events"
        );

        console.log(result);
    }
);

console.log(
    "Registrations: "
    + registrationCounter()
);

console.log(
    "Registrations: "
    + registrationCounter()
);