
package Cursos;

public class CursoIngles extends Curso{
    String tipoIngles;

    public CursoIngles(String nomeCurso, int duracaoMeses,
                       String nivel, String tipoIngles){
        super(nomeCurso, duracaoMeses, nivel);
        this.tipoIngles = tipoIngles;
    }

    public String getTipoIngles() {
        return tipoIngles;
    }

    public void setTipoIngles(String tipoIngles) {
        this.tipoIngles = tipoIngles;
    }

    @Override
    public void exibirDetlhes(){
        super.exibirDetlhes();
        System.out.println("Tipo de ingles: " + tipoIngles);
    }
}
