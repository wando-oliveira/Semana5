import java.sql.SQLOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Teste1 {
    public static void main(String[] args) {
        Eletronico eletronico = new Eletronico();
        eletronico.setNome ("Celular");
        eletronico.setDescricao("Alta tecnologia") ;
        eletronico.setPrecoUnitario(2000.00);
        eletronico.setQuantidade(100);
        eletronico.potencia = "54v";
        eletronico.voltagem = "220v";


        Livro livro = new Livro();
        livro.setNome ("Livro");
        livro.setDescricao("Tecnicas de Desenvolvimento");
        livro.setPrecoUnitario(300.00);
        livro.setQuantidade(80);
        livro.isbn = "2345";
        livro.totalPaginas = 325;

        Endereco endereco = new Endereco();
        endereco.bairro = "Vila Nova";
        endereco.cidade = "São Paulo";
        endereco.rua = "Rua Javaranas";
        endereco.numero = 200;
        endereco.complemento = "Casa 2";

        Cliente cliente1 = new Cliente();
        cliente1.nome = "Wando";
        cliente1.telefone = "2233-5555";
        cliente1.cpf = "223.3333.555-99'";
        cliente1.profissao = "Contador";
        cliente1.email = "wando.2gmail.com";
        cliente1.endereco = endereco;

        Cliente cliente2 = new Cliente();
        cliente2.nome = "Carol";
        cliente2.telefone = "2233-5554";
        cliente2.cpf = "223.3333.555-55'";
        cliente2.profissao = "Cantora";
        cliente2.email = "carol.2gmail.com";
        cliente2.endereco = new Endereco();
        cliente2.endereco.rua = "Rua Iraxim";
        cliente2.endereco.numero = 250;




        System.out.println(livro.identificar());
        System.out.println(eletronico.identificar());
        System.out.println(cliente1.identificar());
        System.out.println(cliente2.identificar());


    }
}