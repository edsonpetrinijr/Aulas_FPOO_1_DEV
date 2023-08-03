package Atividade5;

public class CalculadoraPassagem {
    private double distancia;
    private double preco;

    public CalculadoraPassagem(double distancia) {
        this.distancia = distancia;
        calcularPreco();
    }

    private void calcularPreco() {
        if (distancia <= 200) {
            preco = distancia * 0.50;
        } else {
            preco = distancia * 0.45;
        }
    }

    public double getPreco() {
        return preco;
    }
}