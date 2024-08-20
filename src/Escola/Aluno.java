
package Escola;

import Cursos.Curso;

public class Aluno {
    private String nome;
    private int idade;
    private Curso curso;

    public Aluno(String nome, int idade, Curso curso){
        this.nome = nome;
        this.idade = idade;
        this.curso = curso;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void exibirInformacoes(){
        System.out.println("Nome do aluno: " + nome);
        System.out.println("Idade do aluno: " + idade);
        curso.exibirDetlhes();
    }
}
