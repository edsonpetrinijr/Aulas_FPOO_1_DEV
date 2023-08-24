/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author Aluno
 */
public class Carro {
    private String modelo;
    private String marca;
    private String cor;
    private int ano;
    private int quantidadeDeRodas;
    private boolean ligado;
    private int velocidade; 
    
    public Carro() {
    }
    
    public Carro(String modelo, String marca, String cor, int ano, int quantidadeDeRodas) {
        this.modelo = modelo;
        this.marca = marca;
        this.cor = cor;
        this.ano = ano;
        this.quantidadeDeRodas = quantidadeDeRodas;
    }

    public void ligar() {
        if (!ligado) {
            System.out.println("Carro ligado.");
            ligado = true;
        } else {
            System.out.println("O carro já está ligado.");
        }
    }
    
    public void acelerar(int aumento) {
        if (ligado) {
            velocidade += aumento;
            System.out.println("Acelerando. Velocidade atual: " + velocidade + " km/h");
        } else {
            System.out.println("O carro precisa estar ligado para acelerar.");
        }
    }
    
    @Override
    public String toString() {
        return "Carro{" + "modelo=" + modelo + ", marca=" + marca + ", cor=" + cor + ", ano=" + ano + ", quantidadeDeRodas=" + quantidadeDeRodas + '}';
    }
}
