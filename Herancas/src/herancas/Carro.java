/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herancas;

/**
 *
 * @author Aluno
 */
public class Carro extends Veiculo {
    private int qtdePortas;
    private String modeloCambio;
    private String combustivel;

    public Carro(String descricao, int ano, String cor, String modelo, String marca, double valor, boolean zeroKm, boolean freioABS, int qtdePortas, CambioEnum cambioEnum, CombustivelEnum combustivelEnum) {
        super(descricao, ano, cor, modelo, marca, valor, zeroKm, freioABS);
        this.qtdePortas = qtdePortas;
        this.modeloCambio = cambioEnum.getTipoCambio();
        this.combustivel = combustivel;
    }

    @Override
    public String toString() {
        return super.toString() + "Carro{" + "qtdePortas=" + qtdePortas + ", modeloCambio=" + modeloCambio + ", combustivel=" + combustivel + '}';
    }
}
