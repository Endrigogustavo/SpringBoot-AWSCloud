package Strategy;

public class ComportamentoDefencivo implements ComportamentoInterface {
    @Override
    public void mover() {
        System.out.println("Movendo-se defensivamente.");
    }
}
