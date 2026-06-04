function registerUser() {

    console.log("Step 1: Function Started");

    let user = {
        name: "Lavanya",
        email: "test@gmail.com"
    };

    console.log("Step 2: User Data", user);

    debugger; // Breakpoint for Chrome DevTools

    if (!user.email.includes("@")) {
        console.log("Invalid Email");
    } else {
        console.log("Valid Email");
    }

    console.log("Step 3: Function Ended");
}

registerUser();