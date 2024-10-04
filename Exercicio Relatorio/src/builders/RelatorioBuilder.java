package builders;

import entidades.RelatorioRefatorado;

public class RelatorioBuilder {

    private RelatorioRefatorado relatorio = new RelatorioRefatorado();

    public RelatorioBuilder setTitulo (String titulo){
        this.relatorio.setTitulo(titulo);
        return this;
    }

    public RelatorioBuilder setCorpo (String corpo){
        this.relatorio.setCorpo(corpo);
        return this;
    }

    public RelatorioBuilder setRodape (String rodape){
        this.relatorio.setRodape(rodape);
        return this;
    }
    public RelatorioRefatorado build(){
        return this.relatorio;
    }

}
