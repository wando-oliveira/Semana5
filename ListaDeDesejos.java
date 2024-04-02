import java.util.ArrayList;
import java.util.List;

public class ListaDeDesejos {
    private List<Produto> produtos = new ArrayList<>();

    public void adicionaProduto(Produto produto) {
        produtos.add(produto);
    }

    public String imprimeProdutos(){
        return produtos.toString();
    }

}
