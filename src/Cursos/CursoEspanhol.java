package Cursos;

public class CursoEspanhol extends Curso {
    String paisOrigem;

    public CursoEspanhol(String nomeCurso, int duracaoMeses,
                         String nivel, String paisOrigem){
        super(nomeCurso, duracaoMeses, nivel);
        this.paisOrigem = paisOrigem;
    }

    public String getPaisOrigem() {
        return paisOrigem;
    }

    public void setPaisOrigem(String paisOrigem) {
        this.paisOrigem = paisOrigem;
    }

    @Override
    public void exibirDetlhes(){
        super.exibirDetlhes();
        System.out.println("Pais de Origem: " + paisOrigem);
    }
}
