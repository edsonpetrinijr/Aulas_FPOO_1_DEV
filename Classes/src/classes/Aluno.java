/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Aluno
 */
public class Aluno {

    private String nome;
    private String email;
    private String ra;
    private List<Double> notas;

    public Aluno() {
        notas = new ArrayList<>();
    }

    public Aluno(String nome, String email, String ra) {
        this.nome = nome;
        this.email = email;
        this.ra = ra;
        this.notas = new ArrayList<>();
    }

    public void adicionarNota(double nota) {
        notas.add(nota);

        System.out.println("Avaliacao adicionada: " + nota);
    }

    private double calculaMedia() {
        double somaNotas = 0.0;

        for (double nota : notas) {
            somaNotas += nota;
        }

        return somaNotas / notas.size();
    }

    public void foiAprovado() {
        double media = calculaMedia();

        if (media >= 7.0) {
            System.out.println(nome + " foi aprovado!");
        } else {
            System.out.println(nome + " nao foi aprovado, pois a media foi " + media);
        }
    }

    @Override
    public String toString() {
        return "Aluno{" + "nome=" + nome + ", email=" + email + ", ra=" + ra + ", notas=" + notas + '}';
    }
}
