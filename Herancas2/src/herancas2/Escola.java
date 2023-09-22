/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herancas2;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

/**
 *
 * @author Aluno
 */
public class Escola {
    public static void main(String[] args) throws UnsupportedEncodingException {
        System.setOut(new PrintStream(System.out, true, "UTF-8"));
        
        Professor p1 = new Professor(true, "Pedro Nobre", "pedro@gmail.com", 30, "12345678");
        System.out.println(p1);
        System.out.println("O email é Gmail? " + p1.verificarDominioEmailGmail());
        System.out.println("O email é Yahoo? " + p1.verificarDominioEmailYahoo());
        System.out.println("É dedicação exclusiva? " + p1.isDedicacaoExclusiva());

        System.out.println("");
        
        Aluno a1 = new Aluno("e3a12q", "Walter Silva", "walter@yahoo.com", 20, "12345678");
        System.out.println(a1);
        System.out.println("O email é Gmail? " + a1.verificarDominioEmailGmail());
        System.out.println("O email é Yahoo? " + a1.verificarDominioEmailYahoo());
        System.out.println("O RA possui " + a1.contarCaracteres() + " caracteres");

        
        System.out.println("");
        
        Professor p2 = new Professor(true, "Lucas Moura", "lucas@yahoo.com", 23, "87654321");
        System.out.println(p2);
        System.out.println("O email é Gmail? " + p2.verificarDominioEmailGmail());
        System.out.println("O email é Yahoo? " + p2.verificarDominioEmailYahoo());
        System.out.println("É dedicação exclusiva? " + p2.isDedicacaoExclusiva());
        
        System.out.println("");
        
        Aluno a2 = new Aluno("d3c32a", "Edson Junior", "edson@yahoo.com", 16, "87654321");
        System.out.println(a2);
        System.out.println("O email é Gmail? " + a2.verificarDominioEmailGmail());
        System.out.println("O email é Yahoo? " + a2.verificarDominioEmailYahoo());
        System.out.println("O RA possui " + a2.contarCaracteres() + " caracteres");
    }
}
