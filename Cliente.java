public class Cliente implements Identificavel{
    String nome;
    String cpf;
    String email;
    String profissao;
    String telefone;

    Endereco endereco;


    @Override
    public String identificar() {
        return "Nome: " + this.nome + "CPF: " + this.cpf;
    }
}
