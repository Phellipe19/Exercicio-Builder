package builders;

import entidades.PizzaRefatorado;

public class PizzaBuilder {
    private PizzaRefatorado pizza = new PizzaRefatorado();

    public PizzaBuilder setMassa(String massa) {
        this.pizza.setMassa(massa);
        return this;
    }

    public PizzaBuilder setTamanho(String tamanho) {
        this.pizza.setTamanho(tamanho);
        return this;
    }

    public PizzaBuilder addIngredientes(String ingredientes) {
        this.pizza.addIngredientes(ingredientes);
        return this;
    }

    public PizzaBuilder setTemMolho(Boolean temMolho) {
        this.pizza.setTemMolho(temMolho);
        return this;
    }

    public PizzaRefatorado build() {
        return this.pizza;
    }
}
