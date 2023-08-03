package Atividade6;

public class AprovacaoEmprestimo {
    private double valorCasa;
    private double salario;
    private int anosPagar;

    public AprovacaoEmprestimo(double valorCasa, double salario, int anosPagar) {
        this.valorCasa = valorCasa;
        this.salario = salario;
        this.anosPagar = anosPagar;
    }

    public boolean verificarAprovacao() {
        double prestacaoMaxima = salario * 0.30;

        double valorPrestacao = valorCasa / (anosPagar * 12);

        return valorPrestacao <= prestacaoMaxima;
    }
}

