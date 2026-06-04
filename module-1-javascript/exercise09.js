fetch("https://jsonplaceholder.typicode.com/posts")
.then(response => response.json())
.then(data => {
    console.log("Fetched Data:", data.slice(0, 5));
})
.catch(error => {
    console.log("Error:", error);
});

async function loadEvents() {

    try {

        let response =
            await fetch("https://jsonplaceholder.typicode.com/posts");

        let data =
            await response.json();

        console.log("Async Data:", data.slice(0, 5));

    } catch (error) {

        console.log("Async Error:", error);
    }
}

loadEvents();