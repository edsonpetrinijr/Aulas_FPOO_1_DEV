package Atividade7;

public class CalculadoraEnergia {
    private int quantidadeKwh;
    private char tipoInstalacao;
    private double preco;

    public CalculadoraEnergia(int quantidadeKwh, char tipoInstalacao) {
        this.quantidadeKwh = quantidadeKwh;
        this.tipoInstalacao = tipoInstalacao;
        calcularPreco();
    }

    private void calcularPreco() {
        if (tipoInstalacao == 'R' || tipoInstalacao == 'r') {
            if (quantidadeKwh <= 500) {
                preco = quantidadeKwh * 0.40;
            } else {
                preco = quantidadeKwh * 0.65;
            }
        } else if (tipoInstalacao == 'C' || tipoInstalacao == 'c') {
            if (quantidadeKwh <= 1000) {
                preco = quantidadeKwh * 0.55;
            } else {
                preco = quantidadeKwh * 0.60;
            }
        } else if (tipoInstalacao == 'I' || tipoInstalacao == 'i') {
            if (quantidadeKwh <= 5000) {
                preco = quantidadeKwh * 0.55;
            } else {
                preco = quantidadeKwh * 0.60;
            }
        } else {
            System.out.println("Tipo de instalação inválido.");
            preco = 0.0;
        }
    }

    public double getPreco() {
        return preco;
    }
}
