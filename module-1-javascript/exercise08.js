document.getElementById("registerBtn")
.onclick = function () {

    alert("Register Button Clicked");
};

document.getElementById("category")
.onchange = function () {

    console.log(
        "Selected Category: " + this.value
    );
};

document.getElementById("search")
.addEventListener("keydown", function () {

    console.log(
        "Searching: " + this.value
    );
});