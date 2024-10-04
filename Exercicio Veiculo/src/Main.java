import builders.VeiculoBuilder;
import entidades.Veiculo;
import entidades.VeiculoRefatorado;

public class Main {
    public static void main(String[] args){
        System.out.println("\nExecuta Legado");
        executarLegado();

        System.out.println("\nExecuta Refatorado");
        executarRefatorado();

    }

    private static void executarRefatorado(){
        VeiculoRefatorado carro = new VeiculoBuilder()
                .setTipo("Carro |")
                .setCor("Vermelho |")
                .setRodas(4)
                .build();

        VeiculoRefatorado moto = new VeiculoBuilder()
                .setTipo("Moto |")
                .setCor("Azul |")
                .setRodas(2)
                .build();

        System.out.println(moto.toString());
        System.out.println(carro.toString());

    }
    private static void executarLegado() {
        Veiculo carro = new Veiculo("Carro |", "Vermelho |" , 4);
        Veiculo moto = new Veiculo("Moto |", "Azul |", 2);

        System.out.println(moto.toString());
        System.out.println(carro.toString());
    }
}