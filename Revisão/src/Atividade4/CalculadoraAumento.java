package Atividade4;

class CalculadoraAumento {
    private double salario;
    private double aumento;
    
    public CalculadoraAumento(double salario) {
        this.salario = salario;
        calcularAumento();
    }
    
    private void calcularAumento() {
        if (salario > 1350) {
            aumento = salario * 0.10;
        } else {
            aumento = salario * 0.15;
        }
    }
    
    public double getAumento() {
        return aumento;
    }
    
    public double getNovoSalario() {
        return salario + aumento;
    }
}
