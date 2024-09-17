package factoryMethod.exampleFactory;

public abstract class Carro {

    private String modelo;
    private String marca;
    private String acessorios;
    private float valor;

    public abstract String descricao();

    public Carro(String modelo, String marca, String acessorios, float valor) {
        this.modelo = modelo;
        this.marca = marca;
        this.acessorios = acessorios;
        this.valor = valor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getAcessorios() {
        return acessorios;
    }

    public void setAcessorios(String acessorios) {
        this.acessorios = acessorios;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
}
