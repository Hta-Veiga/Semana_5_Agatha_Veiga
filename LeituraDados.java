import java.util.InputMismatchException;
import java.util.Scanner;



public class LeituraDados {
    public static void main(String[] args) {
        try {
            Scanner leitura = new Scanner(System.in);
            System.out.println("Digite o código do Produto: ");
            int codProduto = leitura.nextInt();
            System.out.println("Código digitado: " + codProduto);
        } catch (InputMismatchException e) {
            System.out.println("Erro! Digite apenas números.");
        }
    }
}
