import Facede.Facede;
import Singleton.SingletonEager;
import Singleton.SingletonLazy;
import Singleton.SingletonLazyHolder;
import Strategy.ComportamentoDefencivo;
import Strategy.ComportamentoNormal;
import Strategy.Robo;

public class App {
    public static void main(String[] args) throws Exception {
        //Padrões Estruturais
        //Singleton: Garante que uma classe tenha apenas uma instância e fornece um ponto global de acesso a ela.

        //Teste com o Lazy
        System.out.println("Teste com o Lazy");
        SingletonLazy lazy = SingletonLazy.getInstance();
        System.out.println(lazy);
        SingletonLazy lazy2 = SingletonLazy.getInstance();
        System.out.println(lazy2);
        System.out.println("\n");

        //Teste com o Eager
        System.out.println("Teste com o Eager");
        SingletonEager eager = SingletonEager.getInstance();
        System.out.println(eager);
        SingletonEager eager2 = SingletonEager.getInstance();
        System.out.println(eager2);
        System.out.println("\n");

        //Teste com o LazyHolder
        System.out.println("Teste com o LazyHolder");
        SingletonLazyHolder lazyholder = SingletonLazyHolder.getInstance();
        System.out.println(lazyholder);
        SingletonLazyHolder lazyholder2 = SingletonLazyHolder.getInstance();
        System.out.println(lazyholder2);

        System.out.println("\n");
        System.out.println("\n");
        System.out.println("\n");

        //Padrões Comportamentais
        //Strategy: Define uma família de algoritmos, encapsula cada um, e os torna intercambiáveis
        System.out.println("Teste com o Strategy");
        ComportamentoNormal normal = new ComportamentoNormal();
        ComportamentoDefencivo defencivo = new ComportamentoDefencivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.setComportamento(defencivo);
        robo.mover();
        System.out.println("\n");


        //Padrões Estruturais
        //Facade: Fornece uma interface unificada para um conjunto de interfaces em um subsistema.
        //Teste com o Facade
        System.out.println("Teste com o Facade");
        Facede facede = new Facede();
        facede.MigrarCliente("João", "Rua dos Bobos, 0");
    }
}
