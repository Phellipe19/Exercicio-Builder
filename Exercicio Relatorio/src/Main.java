import builders.RelatorioBuilder;
import entidades.Relatorio;
import entidades.RelatorioRefatorado;

public class Main {
    public static void main(String[] args) {
        System.out.println("Executa Legado");
        executarLegado();

        System.out.println("Executa Refatorado");
        executarRefatorado();

    }
    private static void executarRefatorado(){
        RelatorioRefatorado padrao = new RelatorioBuilder()
                .setTitulo("Diario de um Noob")
                .setCorpo("O Diario de um Noob se trata de um jogador iniciante aprendendo a jogar e ...")
                .build();

        RelatorioRefatorado completo = new RelatorioBuilder()
                .setTitulo("Diario de um Noob")
                .setCorpo("O Diario de um Noob se trata de um jogador ...")
                .setRodape("1 - O Diario de um noob foi criado pelo canal chamado HeadhShotRJ e ...")
                .build();

        System.out.println(padrao.toString());
        System.out.println(completo.toString());
    }

    private static void executarLegado(){
        Relatorio padrao = new Relatorio("Diario de um Noob"
                , "O Diario de um Noob se trata de um " +
                "jogador iniciante aprendendo a jogar e ...");

        Relatorio completo = new Relatorio("Diario de um Noob"
                , "O Diario de um Noob se trata de um " +
                "jogador iniciante aprendendo a jogar e ..."
                , "1 - O Diario de um noob foi criado pelo canal chamado HeadhShotRJ e ...");

    }
}