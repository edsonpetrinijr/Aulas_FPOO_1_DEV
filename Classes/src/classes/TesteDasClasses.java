/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author Aluno
 */
public class TesteDasClasses {
    public static void main(String[] args) {
        Aluno edson = new Aluno("Edson Giovane Petrini Junior", "edsonpetrinijr@gmail.com", "4138");
        Aluno gomes  = new Aluno("Guilherme Gomes Ferreira", "guilhermegomes@gmail.com", "3035");
        
        edson.adicionarNota(7);
        edson.adicionarNota(10);
        edson.adicionarNota(8);
        edson.foiAprovado();
        
        System.out.println(edson.toString());
        
        Carro civic = new Carro("Civic", "Honda", "Prata", 2022, 4);
        Carro mustang = new Carro("Mustang", "Ford", "Vermelho", 2023, 4);

        System.out.println("");
        
        civic.ligar();
        civic.acelerar(50);
        civic.acelerar(40);
        
        System.out.println(civic.toString());
    }
}
