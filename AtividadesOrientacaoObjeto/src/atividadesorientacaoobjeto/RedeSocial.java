/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividadesorientacaoobjeto;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

/**
 *
 * @author Aluno
 */
public class RedeSocial {
    public static void main(String[] args) throws UnsupportedEncodingException {
        System.setOut(new PrintStream(System.out, true, "UTF-8"));
                
        Post post1 = new Post("corithians", "Cássio defendeu seu 32° pênalti com o manto alvinegro! 🖤", 87038, 875);
        post1.avaliarComoSuperLegal();
        System.out.println(post1);
        
        Post post2 = new Post("corithians", "ATENÇÃO, FIEL! 📢", 47234, 488);
        post2.avaliarComoComum();
        System.out.println(post2);
        
        Post post3 = new Post("corithians", "SEMIFINAL, AÍ VAMOS NÓS!!!!!! 🏴🏳️", 337202, 9377);
        post3.avaliarComoLegal();
        System.out.println(post3);
    }
}
