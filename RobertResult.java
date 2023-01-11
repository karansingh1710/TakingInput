package Assignment.ReadingInput;

import java.util.Scanner;

public class RobertResult {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        int m1=Sc.nextInt();
        int m2=Sc.nextInt();
        int m3=Sc.nextInt();
        int total=m1+m2+m3;
       int per= (total/3);
        System.out.println("Total marks: "+total);
        System.out.println("Percentage marks: "+per+"%");
    }
}
