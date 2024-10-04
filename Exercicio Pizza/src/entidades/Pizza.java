package entidades;

public class Pizza {
    private String massa;
    private String tamanho;
    private String ingredientes;
    private Boolean temMolho = false;

    public Pizza(String massa, String tamanho, String ingredientes) {
        this.massa = massa;
        this.tamanho = tamanho;
        this.ingredientes = ingredientes;
    }

    public Pizza(String massa, String tamanho, String ingredientes, Boolean temMolho) {
        this.massa = massa;
        this.tamanho = tamanho;
        this.ingredientes = ingredientes;
        this.temMolho = temMolho;
    }

    @Override
    public String toString(){
        return "Massa: " + this.massa + " " +
                "Tamanho: " + this.tamanho + " " +
                "Ingredientes: " + this.ingredientes + " " +
                "Tem molho: " + (this.temMolho ? "Sim." : "Não.");
    }
}
