package StringExplosion;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String text= sc.nextLine();

        StringBuilder sb=new StringBuilder();

        int expPower=0;

        for (int i = 0; i < text.length(); i++) {
            int radiusIndex=i+1;
            char current=text.charAt(i);

            if (current=='>'){
                sb.append(current);
                expPower+=Integer.parseInt(String.valueOf(text.charAt(radiusIndex)));
            }else if (expPower==0){
                sb.append(current);
            }else{
                expPower--;
            }
        }

        System.out.println(sb);

    }
}
