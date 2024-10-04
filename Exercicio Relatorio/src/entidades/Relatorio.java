package entidades;

public class Relatorio {
    private String titulo = "";
    private String corpo = "";
    private String rodape = "";

    public Relatorio(String titulo, String corpo) {
        this.titulo = titulo;
        this.corpo = corpo;
    }

    public Relatorio(String titulo, String corpo, String rodape) {
        this.titulo = titulo;
        this.corpo = corpo;
        this.rodape = rodape;
    }

    @Override
    public String toString () {
        return "Título: " + this.titulo + " " +
                "Corpo: " + this.corpo + " " +
                "Rodapé: " + this.rodape;
    }
}
