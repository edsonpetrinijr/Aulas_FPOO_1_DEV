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
        
        System.out.println("");
        
        Carro civic = new Carro("Civic", "Honda", CorEnum.PRATA, 2022, 4, MarchaEnum.NEUTRO);
        Carro mustang = new Carro("Mustang", "Ford", CorEnum.VERMELHO, 2023, 4, MarchaEnum.PRIMEIRA_MARCHA);
        
        civic.ligar();
        civic.trocarMarcha(MarchaEnum.MARCHA_RE);
        civic.trocarMarcha(MarchaEnum.PRIMEIRA_MARCHA);
        civic.acelerar(50);
        civic.acelerar(40);
        
        System.out.println(civic.toString());
    }
}
