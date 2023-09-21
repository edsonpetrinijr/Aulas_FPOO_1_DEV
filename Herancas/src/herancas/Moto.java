/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herancas;

/**
 *
 * @author Aluno
 */
public class Moto extends Veiculo {
    private String combustivel;
    private String tipoPartida;
    
    public Moto(String descricao, int ano, String cor, String modelo, String marca, double valor, boolean zeroKm, boolean freioABS, CombustivelEnum combustivelEnum, PartidaEnum partidaEnum) {
        super(descricao, ano, cor, modelo, marca, valor, zeroKm, freioABS);
        this.combustivel = combustivelEnum.getTipoCombusitivel();
        this.tipoPartida = partidaEnum.getTipoPartida();
    }

    @Override
    public String toString() {
        return super.toString() + "Moto{" + "combustivel=" + combustivel + ", tipoPartida=" + tipoPartida + '}';
    }
}
