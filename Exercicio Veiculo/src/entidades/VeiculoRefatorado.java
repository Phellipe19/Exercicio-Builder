package entidades;

public class VeiculoRefatorado {
    private String tipo = "";
    private String cor = "";
    private int rodas = 0;

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setRodas(int quantidade) {
        this.rodas = quantidade;
    }
    @Override
    public String toString() {
        return "Tipo de Veiculo: " + this.tipo + " " +
                "Cor: " + this.cor + " " +
                "Quantidade de Rodas: " + this.rodas;
    }
}
