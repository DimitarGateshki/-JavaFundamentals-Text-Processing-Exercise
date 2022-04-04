package CaesarCipher;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String text= sc.nextLine();
        StringBuilder out=new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char cr= (char) (text.charAt(i)+3);
            out.append(cr);
        }

        System.out.println(out);

    }
}
