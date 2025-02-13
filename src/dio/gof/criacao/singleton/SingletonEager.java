package dio.gof.criacao.singleton;

/**
 * Singleton apressado
 *
 * @author JhonatanLira
 */

public class SingletonEager {

    private static SingletonEager instancia = new SingletonEager();

    private SingletonEager() {
        super();
    }

    public static SingletonEager getInstancia() {
        return instancia;
    }
}