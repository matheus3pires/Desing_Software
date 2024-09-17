package abstractFactory.exampleAula.Models.Carros;

public class Onix extends Carro{

    public Onix(String modelo, String marca, String acessorios, float valor) {
        super(modelo, marca, acessorios, valor);
    }

    @Override
    public String descricao() {
        String saida = "ONIX Modelo: " + getModelo() + "\n";
        saida += "Marca: " + getMarca()+ "\n";
        saida += "Acessorios: " + getAcessorios() + "\n";
        saida += "Valor: " + getValor() + "\n";

        return saida;
    }
}
