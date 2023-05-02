package javaapplication9;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;

public class Pessoa {
    private int idade;
    private int diaNascimento;
    private int mesNascimento;
    private int anoNascimento;
    private String nome;

    public Pessoa(String nome, int diaNascimento, int mesNascimento, int anoNascimento) {
        this.nome = nome;
        this.diaNascimento = diaNascimento;
        this.mesNascimento = mesNascimento;
        this.anoNascimento = anoNascimento;
    }

    public void calculaIdade() {
        LocalDate dataNascimento = LocalDate.of(anoNascimento, mesNascimento, diaNascimento);
        LocalDate dataAtual = LocalDate.now();
        Period periodo = Period.between(dataNascimento, dataAtual);
        this.idade = periodo.getYears();
    }

    public int informaIdade() {
        return this.idade;
    }

    public String toString() {
        return "Nome: " + nome + ", Data de Nascimento: " + diaNascimento + "/" + mesNascimento + "/" + anoNascimento + ", Idade: " + idade;
    }
}
