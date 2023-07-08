
import java.util.Scanner;

public class Aula12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nome = new String[5];
        int[] idade = new int[5];
        String[] sexo = new String[5];
        for (int x = 0; x < 5; x++) {
            System.out.println("-----Cadastro de Usuario-----");

            System.out.println("Insira seu nome:");
            nome[x] = sc.nextLine();
            System.out.println(nome);
            System.out.println("Insira sua idade:");
            idade[x] = Integer.parseInt(sc.nextLine() );
            System.out.println("Insira  o  seu sexo:");
            sexo[x] = sc.nextLine();
        }
        System.out.println("Lista de usuarios");
        for(int x=0; x<5; x++) {
            System.out.println("Nome: "+nome[x]+ " - Idade: " +idade[x] + "- Sexo:" + sexo[x] ) ;
        }
    }
}

