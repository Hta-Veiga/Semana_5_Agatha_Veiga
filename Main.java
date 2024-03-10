//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Livro livro = new Livro();
        livro.nome = "Os Miseráveis";
        livro.isbn = "111.222.333.444";

        Cliente cliente = new Cliente();
        cliente.nome = "João Roberto";
        cliente.cpf = "123.456.789-00";

        System.out.println(livro.nome);
        System.out.println(livro.identificar());
        System.out.println(cliente.identificar());
    }
}