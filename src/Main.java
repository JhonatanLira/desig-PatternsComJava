import dio.gof.criacao.factorymethod.Mensagem;
import dio.gof.criacao.factorymethod.MensagemFactory;
import dio.gof.criacao.singleton.SingletonEager;
import dio.gof.criacao.singleton.SingletonLazy;
import dio.gof.criacao.singleton.SingletonLazyHolder;
import dio.gof.comportamental.strategy.*;
import dio.gof.estrutural.facade.Facade;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
// Singleton
/*
        System.out.println("*** Criação - Singleton *** \n");

        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);

        // Strategy

        System.out.println("\n*** Comportamental - Strategy *** \n");

        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento normal = new ComportamentoNormal();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.mover();
        robo.setComportamento(defensivo);
        robo.mover();
        robo.setComportamento(agressivo);
        robo.mover();
        robo.mover();
        robo.mover();

        // Facade
        System.out.println("\n*** Estrutural - Facade *** \n");
        Facade facade = new Facade();
        facade.migrarCliente("Jhonatan", "28920000");
*/

        //Factory Method
        System.out.println("\n*** Criação - Factory Method *** \n");
        String texto = "Bom dia! Factory Method";
        Mensagem mensagem = MensagemFactory.getmensagem(2);
        mensagem.getMensagem(texto);
    }
}