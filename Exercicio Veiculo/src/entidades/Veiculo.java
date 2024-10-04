package entidades;

public class Veiculo {
    private String tipo = "";
    private String cor = "";
    private int rodas = 0;

    public Veiculo(String tipo, String cor, int rodas) {
        this.tipo = tipo;
        this.cor = cor;
        this.rodas = rodas;
    }
    @Override
    public String toString() {
        return "Tipo de Veiculo: " + this.tipo + " " +
                "Cor: " + this.cor + " " +
                "Quantidade de Rodas: " + this.rodas + " " ;

    }
}
