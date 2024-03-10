import java.net.URI;
import java.net.http.HttpResponse;
import java.net.http.HttpRequest;
import java.net.http.HttpClient;

public class ConsultaApi {
    public static void main(String[] args) throws InterruptedException {

        String endereco = "https://fakestoreapi.com/products/1";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpResquest.newBuilder()
                .uri(URI.create(endereco))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpRresponse.BodyHandlers.ofString());

        String json = response.body();
        System.out.println(json);
    }
}
