package MultiplyBigNumber;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String firstN= sc.nextLine();

        int multi=Integer.parseInt(sc.nextLine());

        if (multi==0){
            System.out.println(0);
            return;
        }

        StringBuilder output=new StringBuilder();
        int temp=0;

        while (firstN.charAt(0)=='0'){
            firstN=firstN.substring(1);

        }

        for (int i = firstN.length()-1; i >=0 ; i--) {
            int sum=Integer.parseInt(String.valueOf(firstN.charAt(i)))*multi;
            sum+=temp;
            output.append(sum%10);
            temp=sum/10;
        }

        if (temp!=0) {
            output.append(temp);
        }
        output.reverse();


        System.out.println(output);

    }
}
