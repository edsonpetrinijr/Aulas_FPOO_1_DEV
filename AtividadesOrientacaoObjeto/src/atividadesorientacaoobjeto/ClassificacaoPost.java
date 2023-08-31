/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package atividadesorientacaoobjeto;

/**
 *
 * @author Aluno
 */
public interface ClassificacaoPost {
    int COMUM = 1;
    int LEGAL = 3;
    int SUPER_LEGAL = 5;
    
    public void avaliarComoComum();
    public void avaliarComoLegal();
    public void avaliarComoSuperLegal();
}
