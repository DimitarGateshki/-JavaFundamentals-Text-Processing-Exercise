package ValidUsernames;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String[] words=sc.nextLine().split(", ");

        for (String word:words) {
            checkTheString(word);
        }
    }

    private static void checkTheString(String word) {
        if (word.length()>=3 && word.length()<=16){
            for (int i = 0; i <word.length() ; i++) {
                char current=word.charAt(i);
                if (!Character.isLetterOrDigit(current) && current!='-' && current!='_'){
                    return;
                }
            }
        }else {
            return;
        }

        System.out.println(word);
    }

}
