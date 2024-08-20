
package Escola;

import Cursos.CursoEspanhol;
import Cursos.CursoIngles;

public class Escola {
    public static void main(String[] args){
        CursoEspanhol cursoEspanhol =
                new CursoEspanhol("Youth",
                        12,
                        "intermediario",
                        "Espanha");
        CursoIngles cursoIngles =
                new CursoIngles("CCI",
                        36,
                        "intermediario",
                        "Americano");

        Aluno roberto = new Aluno("Roberto",
                17,
                cursoEspanhol);

        Aluno silvestre = new Aluno("Silvestre",
                18,
                cursoIngles);

        silvestre.exibirInformacoes();
    }
}
