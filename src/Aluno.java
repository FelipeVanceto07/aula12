public class Aluno {
    String nome;
    String curso;
    int faltas = (0);
    int nota;
    Aluno(String nome, String curso) {
        this. nome =nome;
        this.curso =curso;
    }
    public void darFaltas(int numFaltas  ) {
        if((faltas+numFaltas)<=50) {
            faltas += numFaltas;
        }else{
            System.out.println("esse valor e maior que o numero de faltas permitido");
        }
       }



    public void darNota(int nota){
        this.nota = nota;

    }
}



