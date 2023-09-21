/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estruturadedecisão2;

/**
 *
 * @author Aluno
 */
public class Modelo {
    private double valorPorDia;
    private boolean cafeIncluso;
    private boolean almocoIncluso;
    private boolean jantarIncluso;

    public Modelo(double valorPorDia, boolean cafeIncluso, boolean almocoIncluso, boolean jantarIncluso) {
        this.valorPorDia = valorPorDia;
        this.cafeIncluso = cafeIncluso;
        this.almocoIncluso = almocoIncluso;
        this.jantarIncluso = jantarIncluso;
    }
    
    public double calcularValorDoDia() {
        double valorTotal = valorPorDia;
        
        if (!this.cafeIncluso) {
            valorTotal += 29.99;
        }
        
        if (!this.almocoIncluso) {
            valorTotal += 69.99;
        }
        
        if (!this.jantarIncluso) {
            valorTotal += 59.99;
        }
        
        return valorTotal;
    }
}


