package Atividade2;

public class Produto {
    String nome;
    double valor;
    int quantidade;

    public Produto(String nome, double valor, int quantidade) {
        this.nome = nome;
        this.valor = valor;
        this.quantidade = quantidade;
    }

    public double calcularValorTotal() {
        return valor * quantidade;
    }
}
