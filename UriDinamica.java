import java.net.URI;
import java.util.Scanner;
import java.net.http.HttpClient;
import java.net.http.HttpResponse;
import java.net.http.HttpRequest;


public class UriDinamica {
    public static void main(String[] args) {
        try {
            Scanner leitura = new Scanner(System.in);
            System.out.println("Digite o código do Produto: ");
            int codProduto = leitura.nextInt();

            String endereco = "https://fakestoreapi.com/products/1" + codProduto;

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpResquest.newBuilder()
                    .uri(URI.create(endereco))
                    .build();
            HttpResponse<String> response = client
                    .send(request, HttpRresponse.BodyHandlers.ofString());

            String json = response.body();
            System.out.println(json);
        } catch (InputMismatchException e) {
            System.out.println("Erro! Digite apenas números.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);

        }
    }
}