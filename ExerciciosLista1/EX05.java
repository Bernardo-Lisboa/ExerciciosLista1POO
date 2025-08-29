package ExerciciosLista1;
import java.util.Scanner;

public class EX05 {
    public static void main(String[] args) {
        char alfabeto[] = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
                's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
        boolean flag; //verificacao de caracteres especiais
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o texto: ");
        String textostring = sc.nextLine();
        char textochar[] = textostring.toCharArray(); // transforma a String em um array de caracteres
        for (int i = 0; i < textochar.length; i++) {
            flag = true; // reseta a flag para comparar depois
            for (int j = 0; j < textochar.length; j++) {
                if (j + 3 < 26) {
                    if (textochar[i] == alfabeto[j]) {
                        //ele acha no array qual posicao que a letra está, pula 3 lugares pra frente e escreve
                        System.out.print(alfabeto[j + 3]);
                        flag = false; //como é um caracter do alfabeto botamos a flag como falsa para nao entrar no if la de baixo
                    }
                } else {
                    //
                    System.out.print(alfabeto[j - alfabeto.length + 3]);
                }
                if (flag) { //se for um caracter que nao existe no alfabeto ele escreve sem mudança
                    System.out.print(textochar[i]);
                }
            }
            sc.close();
        }
    }
}
