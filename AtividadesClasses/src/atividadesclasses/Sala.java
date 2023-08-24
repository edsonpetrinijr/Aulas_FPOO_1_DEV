/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividadesclasses;

/**
 *
 * @author Aluno
 */
public class Sala {
    private int numeroCadeiras;
    private int numeroMesas;
    private int numeroSala;
    private boolean temProjetor;
    private int numeroComputadores;
    private boolean reservada;

    public Sala() {
    }
    
    public Sala(int numeroCadeiras, int numeroMesas, int numeroSala, boolean temProjetor, int numeroComputadores) {
        this.numeroCadeiras = numeroCadeiras;
        this.numeroMesas = numeroMesas;
        this.numeroSala = numeroSala;
        this.temProjetor = temProjetor;
        this.numeroComputadores = numeroComputadores;
        this.reservada = false;
    }
    
    public void reservarSala() {
        if (!reservada) {
            reservada = true;
            System.out.println("Sala " + numeroSala + " reservada com sucesso.");
        } else {
            System.out.println("Sala " + numeroSala + " ja esta reservada.");
        }
    }

    public void liberarSala() {
        if (reservada) {
            reservada = false;
            System.out.println("Sala " + numeroSala + " liberada.");
        } else {
            System.out.println("Sala " + numeroSala + " nao estava reservada.");
        }
    }

    @Override
    public String toString() {
        return "Sala{" + "numeroCadeiras=" + numeroCadeiras + ", numeroMesas=" + numeroMesas + ", numeroSala=" + numeroSala + ", temProjetor=" + temProjetor + ", numeroComputadores=" + numeroComputadores + ", reservada=" + reservada + '}';
    }
}
