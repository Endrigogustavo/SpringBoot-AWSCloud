package Strategy;

public class Robo {
    private ComportamentoInterface comportamento;

    public void setComportamento(ComportamentoInterface comportamento) {
        this.comportamento = comportamento;
    }

    public void mover() {
        comportamento.mover();
    }
}
