package ExerciciosLista1;
import java.util.Scanner;

public class EX05 {
    public static void main(String[] args) {
        char alfabeto[] = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
                's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
        boolean flag;
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o texto: ");
        String textostring = sc.nextLine();
        char textochar[] = textostring.toCharArray();
        for (int i = 0; i < textochar.length; i++) {
            flag = true;
            for (int j = 0; j < textochar.length; j++) {
                if (j + 3 < 26) {
                    if (textochar[i] == alfabeto[j]) {
                        System.out.print(alfabeto[j + 3]);
                        flag = false;
                    }
                } else {
                    System.out.print(alfabeto[j - alfabeto.length + 3]);
                }
                if (flag) {
                    System.out.print(textochar[i]);
                }
            }
            sc.close();
        }
    }
}
