import java.util.InputMismatchException;
import java.util.Scanner;

public class Teste2 {
    public static void main(String[] args) {
        try {
            Scanner leitura = new Scanner(System.in);
            System.out.println(" Digite o ID do Produto");
            int idProduto = leitura.nextInt();
            System.out.println("Id digitado: " + idProduto);
        } catch (InputMismatchException e){
            System.out.println("Erro, vc digitou um valor não mumérico.");
        };

    }
}
