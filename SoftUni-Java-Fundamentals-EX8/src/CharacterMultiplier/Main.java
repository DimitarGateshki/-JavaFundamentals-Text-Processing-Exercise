package CharacterMultiplier;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String[] words=sc.nextLine().split("\\s+");

        System.out.println(sumWords(words[0], words[1]));


    }

    private static int  sumWords(String word, String word1) {
        int sum=0;
        if (word.length()>word1.length()){
            for (int i = 0; i < word1.length(); i++) {
                sum+=word.charAt(i)*word1.charAt(i);
            }
            for (int i = word1.length(); i <word.length() ; i++) {
                sum+=word.charAt(i);
            }

        }else if (word1.length()>word.length()){
            for (int i = 0; i < word.length(); i++) {
                sum+=word.charAt(i)*word1.charAt(i);
            }
            for (int i = word.length(); i <word1.length() ; i++) {
                sum+=word1.charAt(i);
            }

        }else {
            for (int i = 0; i < word1.length(); i++) {
                sum+=word.charAt(i)*word1.charAt(i);
            }
        }
        return sum;
    }
}
