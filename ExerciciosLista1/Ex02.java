package ExerciciosLista1;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int notaProva[]= new int[6];
        int notaProjeto[]= new int[2];
        int somaProj=0;
        int somaNotas = 0;
        System.out.print("Digite a frequência do aluno: ");
        int freq = sc.nextInt();
        sc.nextLine(); //Buffer para poder ler um int depois
        for (int i = 0; i < notaProva.length; i++) {
            System.out.print("Digite a nota da prova "+(i+1)+": ");
            notaProva[i]= sc.nextInt();
            sc.nextLine();
            somaNotas+=notaProva[i];
        }
        double media = somaNotas/6;
        for (int i = 0; i < notaProjeto.length; i++) {
            System.out.print("Digite a nota do projeto "+(i+1)+": ");
            notaProjeto[i]= sc.nextInt();
            sc.nextLine();
            somaProj+=notaProjeto[i];
        }
        double mediaProj = somaProj/2;
        //essa é a equação que tem no exercicio
        double r = Math.round((((3*media)+(2*mediaProj))/5)*Math.floor(media/6)*Math.floor(mediaProj/6));
        //o Math.round arredonda para o inteiro mais proximo e o Math.floor só corta o decimal por exemplo 6,7 vira 6
        System.out.println("Resultado media = "+r);
        if (freq>74 && r>5) {
            System.out.println("Aluno aprovado");
        }else{
            System.out.println("Aluno reprovado");
        }
        sc.close();
    }
}
