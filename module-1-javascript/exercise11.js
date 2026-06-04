const form =
document.getElementById("eventForm");

const message =
document.getElementById("message");

form.addEventListener("submit", function (e) {

    e.preventDefault();

    const name =
        form.elements["name"].value;

    const email =
        form.elements["email"].value;

    const eventName =
        form.elements["eventName"].value;

    if (
        name === "" ||
        email === ""
    ) {
        message.className = "error";
        message.innerHTML =
            "All fields are required!";
        return;
    }

    message.className = "success";
    message.innerHTML =
        `${name} registered for ${eventName}`;

    console.log({
        name,
        email,
        eventName
    });
});