import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int variavel =1;
        String teste ="dght";
        Aluno aluno1 =new Aluno("felipe","TI");
        Aluno aluno2 = new Aluno("joao","TI");

        System.out.println("O Aluno " +aluno1.nome+ " esta fazendo concurso de  "+aluno1.curso);

        aluno1.darFaltas(2);
        System.out.println("O Aluno " +aluno1.nome+ " Ele tem  "+aluno1.faltas+ " faltas" );


        aluno1.darFaltas(49);
        System.out.println("O Aluno " +aluno1.nome+ " Ele tem  "+aluno1.faltas+ " faltas" );


        aluno1.darNota(80);
        System.out.println("O Aluno" +aluno1.nome + " Ele tirou "+aluno1.nota+" notas");

        aluno1.darNota(50);
        System.out.println("O Aluno" +aluno1.nome + " Ele tirou "+aluno1.nota+" notas");
      aluno2.nome = " Joao ";
      aluno2.curso="Ti";
        System.out.println("o Aluno" +aluno2.nome+ " esta fazendo concurso de " +aluno2.curso);

        aluno2.darFaltas(2);
        System.out.println("O Aluno " +aluno2.nome+ " Ele tem  "+aluno2.faltas+ " faltas" );

        aluno2.darFaltas(49);
        System.out.println("O Aluno " +aluno2.nome+ " Ele tem  "+aluno2.faltas+ " faltas" );

        aluno2.darNota(80);
        System.out.println("O Aluno" +aluno2.nome + " Ele tirou "+aluno2.nota+" notas");

        aluno2.darNota(80);
        System.out.println("O Aluno" +aluno2.nome + " Ele tirou "+aluno2.nota+" notas");

        List<Aluno> listadealunos =new ArrayList<>();
        listadealunos.add(aluno1);
        listadealunos.add(aluno2);

        for (Aluno aluno: listadealunos){
            System.out.println("Aluno -> nome ="+aluno.nome+
                    "curso ="+aluno.curso+" faltas="+aluno.faltas+" nota="+aluno.nota);
        }
    }
}
