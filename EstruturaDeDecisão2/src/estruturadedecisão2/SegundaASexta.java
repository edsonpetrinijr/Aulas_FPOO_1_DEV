/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estruturadedecisão2;

/**
 *
 * @author Aluno
 */
public class SegundaASexta {
    private ModeloEnum modeloDoQuarto;
    
    public SegundaASexta(ModeloEnum modeloDoQuarto) {
        this.modeloDoQuarto = modeloDoQuarto;
    }

    public double calcularPreçoTotal() {
        double precoTotal = 0;
        
        if (modeloDoQuarto == ModeloEnum.BASICO) {
            Modelo basico = new Modelo(89.90, false, false, true);
            precoTotal = basico.calcularValorDoDia();
        } else if (modeloDoQuarto == ModeloEnum.SUPERFLEX) {
            Modelo superflex = new Modelo(109.90, true, false, true);
            precoTotal = superflex.calcularValorDoDia();
        } else if (modeloDoQuarto == ModeloEnum.PREMIUM) {
            Modelo premium = new Modelo(199.90, true, true, false);
            precoTotal = premium.calcularValorDoDia();
        } else if (modeloDoQuarto == ModeloEnum.MASTER) {
            Modelo master = new Modelo(259.90, true, true, true);
            precoTotal = master.calcularValorDoDia();
        }
        
        return precoTotal;
    }
}
