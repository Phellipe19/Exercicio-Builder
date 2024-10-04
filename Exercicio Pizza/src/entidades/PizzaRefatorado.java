package entidades;

public class PizzaRefatorado {
    private String massa = "";
    private String tamanho = "";
    private String ingredientes = "";
    private Boolean temMolho = false;

    public void setMassa(String massa) {
        this.massa = massa;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public void addIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    public void setTemMolho(Boolean temMolho) {
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
