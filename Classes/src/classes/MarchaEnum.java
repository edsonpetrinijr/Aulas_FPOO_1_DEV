/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author Aluno
 */
public enum MarchaEnum {
    PRIMEIRA_MARCHA("Primeira Marcha", 1),
    SEGUNDA_MARCHA("Segunda Marcha", 2),
    TERCEIRA_MARCHA("Terceira Marcha", 3),
    QUARTA_MARCHA("Quarta Marcha", 4),
    QUINTA_MARCHA("Quinta Marcha", 5),
    SEXTA_MARCHA("Sexta Marcha", 6),
    MARCHA_RE("Marcha Ré", -1),
    NEUTRO("Neutro", 0);
    
    private String marcha;
    private int numeroDaMarcha;

    private MarchaEnum(String marcha, int numeroDaMarcha) {
        this.marcha = marcha;
        this.numeroDaMarcha = numeroDaMarcha;
    }

    public String getMarcha() {
        return marcha;
    }

    public int getNumeroDaMarcha() {
        return numeroDaMarcha;
    }
    
    
}
