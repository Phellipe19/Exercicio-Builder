package builders;

import entidades.VeiculoRefatorado;

public class VeiculoBuilder {
    private VeiculoRefatorado veiculo = new VeiculoRefatorado();

    public VeiculoBuilder  setTipo (String tipo){
        this.veiculo.setTipo(tipo);
        return this;
    }

    public VeiculoBuilder setCor (String cor){
        this.veiculo.setCor(cor);
        return this;
    }

    public VeiculoBuilder setRodas (int quantidade){
        this.veiculo.setRodas(quantidade);
        return this;
    }

    public VeiculoRefatorado build(){
        return this.veiculo;
    }
}
