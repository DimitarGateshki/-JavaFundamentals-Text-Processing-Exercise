package ExtractFile;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String[] path=sc.nextLine().split("\\\\");
        String[] file=path[path.length-1].split("\\.");
        System.out.println("File name: "+file[0]);
        System.out.println("File extension: "+file[1]);

    }
}
