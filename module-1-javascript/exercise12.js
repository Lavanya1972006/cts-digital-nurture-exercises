function sendRegistration() {

    const userData = {
        name: "Lavanya",
        email: "lavanya@gmail.com",
        event: "Music Fest"
    };

    setTimeout(async () => {

        try {

            const response =
                await fetch(
                    "https://jsonplaceholder.typicode.com/posts",
                    {
                        method: "POST",
                        headers: {
                            "Content-Type": "application/json"
                        },
                        body: JSON.stringify(userData)
                    }
                );

            const result =
                await response.json();

            if (response.ok) {
                console.log("Registration Success:", result);
            } else {
                console.log("Registration Failed");
            }

        } catch (error) {
            console.log("Error:", error);
        }

    }, 2000);
}

sendRegistration();