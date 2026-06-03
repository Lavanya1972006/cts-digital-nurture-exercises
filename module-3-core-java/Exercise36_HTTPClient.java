import java.net.URI;
import java.net.http.*;

public class Exercise36_HTTPClient {

    public static void main(String[] args) throws Exception {

        HttpClient client =
                HttpClient.newHttpClient();

        HttpRequest request =
                HttpRequest.newBuilder()
                        .uri(new URI("https://api.github.com"))
                        .GET()
                        .build();

        HttpResponse<String> response =
                client.send(
                        request,
                        HttpResponse.BodyHandlers.ofString());

        System.out.println("Status: "
                + response.statusCode());

        System.out.println(response.body());
    }
}