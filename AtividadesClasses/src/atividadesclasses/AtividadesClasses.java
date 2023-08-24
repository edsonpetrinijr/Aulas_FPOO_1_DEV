/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividadesclasses;

/**
 *
 * @author Aluno
 */
public class AtividadesClasses {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Computador notebook = new Computador(
                TipoDeMemoriaEnum.DDR4,
                ProcessadorEnum.INTEL,
                16,
                SistemaOperacionalEnum.WINDOWS
        );
        Computador desktop = new Computador(
                TipoDeMemoriaEnum.DDR3,
                ProcessadorEnum.AMD,
                8,
                SistemaOperacionalEnum.MACOS
        );
        Computador servidor = new Computador(
                TipoDeMemoriaEnum.DDR4,
                ProcessadorEnum.INTEL,
                32,
                SistemaOperacionalEnum.LINUX
        );

        notebook.ligar();
        notebook.aumentarMemoriaRAM(16);
        notebook.desligar();
        notebook.aumentarMemoriaRAM(16);

        System.out.println("");

        Sala laboratorioDeInformatica = new Sala(
                32,
                8,
                101,
                true,
                32
        );
        Sala salaDeAula = new Sala(
                25,
                5,
                202,
                true,
                0
        );
        Sala salaDeReuniao = new Sala(
                12,
                1,
                303,
                false,
                2
        );

        laboratorioDeInformatica.liberarSala();
        laboratorioDeInformatica.reservarSala();
        laboratorioDeInformatica.liberarSala();

        System.out.println("");

        Curso cursoGoogleCloudFoundations = new Curso(
                "Implantacao de Servicos em Nuvem - Google Cloud Foundations",
                "Aprenda a implantar e gerenciar servicos em nuvem utilizando a plataforma Google Cloud.",
                CategoriaEnum.TECNOLOGIA_DA_INFORMACAO,
                20
        );
        Curso cursoDeConstrucaoCivil = new Curso(
                "Construção Civil - Fundamentos e Técnicas",
                "Aprenda os princípios da construção civil, desde fundações até acabamentos.",
                CategoriaEnum.CONSTRUCAO_CIVIL,
                15
        );
        Curso cursoDeVestuario = new Curso(
                "Design de Moda",
                "Explore a criatividade no design de roupas e acessórios de moda.",
                CategoriaEnum.VESTUARIO,
                20
        );
        cursoGoogleCloudFoundations.cancelarInscricao();
        cursoGoogleCloudFoundations.realizarInscricao();
        cursoGoogleCloudFoundations.cancelarInscricao();
    }

}
