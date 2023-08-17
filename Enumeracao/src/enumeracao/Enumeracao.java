/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package enumeracao;

/**
 *
 * @author Aluno
 */
public class Enumeracao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Usuario 1", "usuario@gmail.com", true, TipoUsuarioEnum.COMUM);
                
        System.out.println(usuario);
        
        Pedido pedido = new Pedido("Pedido do usuario 1", 29.99,StatusEnum.EM_PREPARACAO);
        System.out.println(pedido);
        
        pedido.setStatus(StatusEnum.EM_TRANSPORTE);
        System.out.println(pedido);
        
        pedido.setStatus(StatusEnum.ENTREGUE);
        System.out.println(pedido);
    }
    
}
