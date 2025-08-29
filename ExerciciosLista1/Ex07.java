package ExerciciosLista1;

import java.util.Arrays;
import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        int n = 0;
        do {
            System.out.printf("Entre com a quantidade de linhas: ");
            try { //primeiro faz uma verificação de que o usuario escreveu mesmo um numero
                n = sc.nextInt();
                flag=false;
            }
            catch(Exception e) { //se nao foi um numero ele passa pra esse comando 
                System.out.println("Entre com um número valido.");
            }
        } while (flag); //como a flag só vai virar falsa quando nao der erro, ele vai rodar essas linhas até dar certo
        criarPascal(n);
        sc.close();
    }
    public static void criarPascal(int n){
        int[] pascal = new int[n]; //cria um array para a linha que esta sendo escrita
        int[] pascalanterior = new int[n];// cria um array para a linha anterior que vai ser utilizada depois
        pascalanterior[0] = 1;
        for (int i = 0; i < n+1; i++) {
            for (int j = 0; j < i; j++) {
                if (j == 0){
                    // primeiro numero sempre vai ser 1
                    System.out.print("1 ");
                    pascal[0]=1;
                }else {
                    //usamos a linha anterior para fazer as contas para saber qual numero escrever
                    //ele pega a posicao do array que estamos e soma o valor que existe nessa posicao na linha de cima com o da sua posicao anterior na mesma linha de cima
                    pascal[j] = pascalanterior[j] + pascalanterior[j - 1];
                    System.out.printf("%d ", pascal[j]);
                }
            }
            //depois de fazer a linha inteira ele copia o array inteiro feito pra ser utilizado pra linha seguinte
            pascalanterior=Arrays.copyOf(pascal, pascal.length);
            System.out.println();
        }
    }
}
