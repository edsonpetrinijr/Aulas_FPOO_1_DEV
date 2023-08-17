/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividadesenumeracao;

/**
 *
 * @author Aluno
 */
public class AtividadesEnumeracao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Usuario usuario = new Usuario(
                "Moises",
                MesEnum.FEVEREIRO.getMes(),
                CategoriaLivroEnum.TECNICO.getCategoriaLivro(),
                CategoriaComidaEnum.PRATO_FEITO.getCategoriaComida(),
                CategoriaRedeSocialEnum.NOTICIAS.getCategoriaRedeSocial()
        );
        
        System.out.println(usuario);
    }
}
