import java.io.IOException;
import java.net.http.*;
import java.net.*;
import java.net.http.HttpResponse.BodyHandlers;

public class Client {
    public static void main(String args[]) throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request =
        HttpRequest.newBuilder().uri(URI.create("http://localhost:3000/soma/3/2")).build();
        HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
        System.out.println(response.body());
    }
}
