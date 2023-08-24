/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividadesclasses;

/**
 *
 * @author Aluno
 */
public class Computador {
    private TipoDeMemoriaEnum tipoDeMemoria;
    private ProcessadorEnum processador;
    private int memoriaRAMEmGB;
    private SistemaOperacionalEnum sistemaOperacional;
    private boolean ligado;

    public Computador() {
    }

    public Computador(TipoDeMemoriaEnum tipoDeMemoria, ProcessadorEnum processador, int memoriaRAMEmGB, SistemaOperacionalEnum sistemaOperacional) {
        this.tipoDeMemoria = tipoDeMemoria;
        this.processador = processador;
        this.memoriaRAMEmGB = memoriaRAMEmGB;
        this.sistemaOperacional = sistemaOperacional;
        this.ligado = false;
    }

    public void ligar() {
        ligado = true;
        System.out.println("O computador foi ligado com sucesso.");
    }

    public void desligar() {
        ligado = false;
        System.out.println("O computador foi desligado com sucesso.");
    }

    public void aumentarMemoriaRAM(int quantidadeGB) {
        if (ligado) {
            memoriaRAMEmGB += quantidadeGB;
            System.out.println("Memoria RAM aumentada para " + memoriaRAMEmGB + " GB.");
        } else {
            System.out.println("Nao e possivel alterar a memoria RAM com o computador ligado.");
        }
    }

    @Override
    public String toString() {
        return "Computador{" + "tipoDeMemoria=" + tipoDeMemoria + ", processador=" + processador + ", memoriaRAMEmGB=" + memoriaRAMEmGB + ", sistemaOperacional=" + sistemaOperacional + ", ligado=" + ligado + '}';
    }
}
