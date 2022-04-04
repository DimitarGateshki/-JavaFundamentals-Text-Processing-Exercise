package ReplaceRepeatingChars;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String text= sc.nextLine();

        StringBuilder sb=new StringBuilder();

        char token=text.charAt(0);
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i)!=token) {
                sb.append(token);
                token = text.charAt(i);
            }
        }

        sb.append(token);

        System.out.println(sb);




    }
}
