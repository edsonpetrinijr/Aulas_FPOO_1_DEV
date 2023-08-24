/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author Aluno
 */
public class Bicicleta {
    private int quantidadeDeRodas;
    private boolean temMarchas;
    private int quantidadeDeMarchas;
    private String modelo;
    private boolean temFreio;
    private String cor;
    private String situacao;
    private int velocidadeEmKmH;

    public Bicicleta() {
    }

    public Bicicleta(int quantidadeDeRodas, boolean temMarchas, int quantidadeDeMarchas, String modelo, boolean temFreio, String cor) {
        this.quantidadeDeRodas = quantidadeDeRodas;
        this.temMarchas = temMarchas;
        this.quantidadeDeMarchas = quantidadeDeMarchas;
        this.modelo = modelo;
        this.temFreio = temFreio;
        this.cor = cor;
        this.situacao = "Parado";
        this.velocidadeEmKmH = 0;
    }
    
    public void andar(int novaVelocidade) {
        this.situacao = "Andando";
        this.velocidadeEmKmH = novaVelocidade;
    }
    
    public void frear() {
        this.situacao = "Freiando";
        this.velocidadeEmKmH -= 1;
    }
    
    public boolean verificarSeTemFreio() {
        return this.temFreio;
    }

    @Override
    public String toString() {
        return "Bicicleta{" + "quantidadeDeRodas=" + quantidadeDeRodas + ", temMarchas=" + temMarchas + ", quantidadeDeMarchas=" + quantidadeDeMarchas + ", modelo=" + modelo + ", temFreio=" + temFreio + ", cor=" + cor + ", situacao=" + situacao + ", velocidadeEmKmH=" + velocidadeEmKmH + '}';
    }
}
