import builders.PizzaBuilder;
import entidades.Pizza;
import entidades.PizzaRefatorado;

public class Main {
    public static void main(String[] args){

        System.out.println("\nExecutar Legado");
        executarLegado();

        System.out.println("\nExecutar Refatorado");
        executarRefatorado();

    }
    private static void executarRefatorado(){
        PizzaRefatorado Calabresa = new PizzaBuilder()
                .setMassa("Farinha de Trigo |")
                .setTamanho("Médio |")
                .addIngredientes("Linguiça calabresa |")
                .build();

        PizzaRefatorado Pepperoni = new PizzaBuilder()
                .setMassa("Napoliana |")
                .setTamanho("Pequena |")
                .addIngredientes("Salame italiano |")
                .build();

        PizzaRefatorado quatroQueijos = new PizzaBuilder()
                .setMassa("Toscana |")
                .setTamanho("Grande |")
                .addIngredientes("Queijo provolone, gorgonzola, muçarela e parmesão |")
                .setTemMolho(true)
                .build();

        System.out.println(Calabresa.toString());
        System.out.println(Pepperoni.toString());
        System.out.println(quatroQueijos.toString());

    }

    private static void executarLegado(){
        Pizza Calabresa = new Pizza("Farinha de Trigo |", "Médio |", "Linguiça calabresa |");
        Pizza Pepperoni = new Pizza("Napoliana |", "Pequena |", "Salame italiano |");
        Pizza quatroQueijos = new Pizza("Toscana", "Grande", "Queijo provolone, gorgonzola, muçarela e parmesão |", true);

        System.out.println(Calabresa.toString());
        System.out.println(Pepperoni.toString());
        System.out.println(quatroQueijos.toString());

    }

}
