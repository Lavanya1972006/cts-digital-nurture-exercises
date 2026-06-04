const container =
document.querySelector("#eventContainer");

container.innerHTML = "";

let eventList = [
    "Music Fest",
    "Baking Workshop",
    "Football Match"
];

eventList.forEach(event => {

    let card =
        document.createElement("div");

    card.className = "card";

    card.innerHTML =
        `<h3>${event}</h3>`;

    container.appendChild(card);
});