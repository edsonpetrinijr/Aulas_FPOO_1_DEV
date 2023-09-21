/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estruturadedecisão2;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class EstruturaDeDecisão2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws UnsupportedEncodingException {
        System.setOut(new PrintStream(System.out, true, "UTF-8"));
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos dias durante a semana você ficará? (de segunda à sexta)");
        int quantidadeDeDiasSegundaASexta = scanner.nextInt();
        
        System.out.println("Quantos dias durante o final de semana você ficará? (de sábado à domingo)");
        int quantidadeDeDiasSabadoEDomingo = scanner.nextInt();
        
        System.out.println("Qual plano você deseja?");
        System.out.println("1. Básico");
        System.out.println("2. Superflex");
        System.out.println("3. Premium");
        System.out.println("4. Master");
        
        int plano = scanner.nextInt();
        
        SegundaASexta segundaASexta;
        SabadoEDomingo sabadoEDomingo;

        if (plano == 1) {
            segundaASexta = new SegundaASexta(ModeloEnum.BASICO);
            sabadoEDomingo = new SabadoEDomingo(ModeloEnum.BASICO);
        } else if (plano == 2) {
            segundaASexta = new SegundaASexta(ModeloEnum.SUPERFLEX);
            sabadoEDomingo = new SabadoEDomingo(ModeloEnum.SUPERFLEX);
        } else if (plano == 3) {
            segundaASexta = new SegundaASexta(ModeloEnum.PREMIUM);
            sabadoEDomingo = new SabadoEDomingo(ModeloEnum.PREMIUM);
        } else {
            segundaASexta = new SegundaASexta(ModeloEnum.MASTER);
            sabadoEDomingo = new SabadoEDomingo(ModeloEnum.MASTER);
        }
        
        double precoTotal = 
            (segundaASexta.calcularPreçoTotal() * quantidadeDeDiasSegundaASexta) +
            (sabadoEDomingo.calcularPreçoTotal() * quantidadeDeDiasSabadoEDomingo);

        System.out.println("O valor total será de: R$ " + precoTotal);

    }
}
