/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herancas;

/**
 *
 * @author Aluno
 */
public class Veiculo {
    private String descricao;
    private int ano;
    private String cor;
    private String modelo;
    private String marca;
    private double valor;
    private boolean zeroKm;
    private boolean freioABS;

    public Veiculo(String descricao, int ano, String cor, String modelo, String marca, double valor, boolean zeroKm, boolean freioABS) {
        this.descricao = descricao;
        this.ano = ano;
        this.cor = cor;
        this.modelo = modelo;
        this.marca = marca;
        this.valor = valor;
        this.zeroKm = zeroKm;
        this.freioABS = freioABS;
    }

    @Override
    public String toString() {
        return "Veiculos{" + "descricao=" + descricao + ", ano=" + ano + ", cor=" + cor + ", modelo=" + modelo + ", marca=" + marca + ", valor=" + valor + ", zeroKm=" + zeroKm + ", freioABS=" + freioABS + '}';
    }
}
