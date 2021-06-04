package basicoop;

import java.util.Scanner;

public class input2 {
    public static void main(String[] args){
        
    Scanner input=new Scanner(System.in);
    System.out.println("Please Enter First Number: ");
    int a=input.nextInt();
    System.out.println("Please Enter Second Number: ");
    int b=input.nextInt();
    int c=(a+b);
    
    System.out.println("Sum Of Two Numbers: "+c);
    }
}
