package Assignment.ReadingInput;
import java.util.*;

public class SingleLineFormat {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        String lastname=sc.next();
        int roll=sc.nextInt();
        String f_o_i=sc.next();
        System.out.println("Name: "+name+" "+lastname);
        System.out.println("Roll Number: "+roll);
        System.out.println("Field of interest: "+f_o_i);
    }
}

