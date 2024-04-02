public class Eletronico extends Produto implements Identificavel{
String voltagem;

String potencia;


    @Override
    public String identificar() {
        return "Nome: " + this.getNome() + " Voltagem: " + this.voltagem + "Potencia: " + this.potencia;
    }
}