package Strategy;

public class ComportamentoNormal implements ComportamentoInterface {
    @Override
    public void mover() {
        System.out.println("Movendo-se normalmente.");
    }
}
