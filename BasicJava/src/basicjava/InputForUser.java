package basicjava;

import java.util.Scanner;


public class InputForUser {
    public static void main (String[] arg){
    Scanner input=new Scanner(System.in);
    int num;
    
    System.out.print("Enter Number: ");
    num=input.nextInt();
    
    System.out.print("your Number: "+num);
    }
}
