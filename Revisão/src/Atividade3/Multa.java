package Atividade3;

public class Multa {
    private int velocidade;
    private double valorMulta;

    public Multa(int velocidade) {
        this.velocidade = velocidade;
        verificarMulta();
    }

    private void verificarMulta() {
        if (velocidade > 80) {
            int kmAcima = velocidade - 80;
            valorMulta = kmAcima * 5;
        } else {
            valorMulta = 0;
        }
    }

    public double getValorMulta() {
        return valorMulta;
    }
}
