// Main.java
import java.util.Scanner;

public class Main {

    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);

        int[] a = {3, 4, 5, 3, 2, 8};
        char[] s = {'B', 'R', 'A', 'I', 'M', 'A'};
        String [] nome = {"BRAIMA", "DJAGUITÉ", "OLÁ", "MUNDO"};
        for(int i = 0; i < 5; i++){
            System.out.println(a[i]);
        }
        for(int i = 0; i < 6; i++){
            System.out.println(s[i]);
        }
        for(int i = 0; i < 4; i++){
            System.out.println(nome[i]);
        }

        int v = 0;
        v++;
        int amount = v;
        System.out.println(++v + " " + amount);
        System.out.println(v);
        long b = 0;
        System.out.println(b);
        b = 3;
        System.out.println(b);
        int bo = 0;
        System.out.println(bo);
        boolean boo = false;
        int aa = 5;
        System.out.println(boo);
        System.out.println(aa);

    }
}