public class Livro extends Produto implements Identificavel{
    String isbn;
    int totalPaginas;


    @Override
    public String identificar() {
        return "Nome: " + this.getNome() + " Isbn: " + this.isbn;
    }
}
