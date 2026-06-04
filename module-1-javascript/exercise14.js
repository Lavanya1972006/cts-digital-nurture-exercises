$(document).ready(function () {

    $("#registerBtn").click(function () {

        $(".card").fadeOut(500, function () {
            $(".card").fadeIn(500);
        });

        console.log("jQuery Click Event Triggered");
    });
});