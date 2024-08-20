
package Cursos;

public class Curso {
    protected String nomeCurso, nivel;
    protected  int duracaoMeses;

    public Curso(String nomeCurso, int duracaoMeses, String nivel){
        this.nomeCurso = nomeCurso;
        this.duracaoMeses = duracaoMeses;
        this.nivel = nivel;
    }

    public int getDuracaoMeses() {
        return duracaoMeses;
    }

    public void setDuracaoMeses(int duracaoMeses) {
        this.duracaoMeses = duracaoMeses;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        nomeCurso = nomeCurso;
    }

    public void exibirDetlhes(){
        System.out.println("Nome do curso: " + nomeCurso);
        System.out.println("Duração em meses: " + duracaoMeses);
        System.out.println("Nivel do curso: " + nivel);
    }
}
