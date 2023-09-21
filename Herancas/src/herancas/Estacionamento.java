/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herancas;

/**
 *
 * @author Aluno
 */
public class Estacionamento {
    public static void main(String[] args) {
        Carro gol = new Carro("Gol muito bem conservado",1999, "Azul", "G2", "Volkswagen", 13999, false, false, 5, CambioEnum.MANUAL, CombustivelEnum.GASOLINA);
        System.out.println(gol);
        
        Moto hornet = new Moto("Vendo Hornet 2014", 2017, "Preta", "X12", "Honda", 40000, true, true, CombustivelEnum.GASOLINA, PartidaEnum.PEDAL);
        System.out.println(hornet);
        
        Scooter scooter = new Scooter(2000, "Scooter Elétrica", 2023, "Cinza", "Elektra", "Honda", 10000, true, false);
        System.out.println(scooter);
    }
}
