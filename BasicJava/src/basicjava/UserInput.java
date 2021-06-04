package basicjava;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] arg){
        Scanner input=new Scanner(System.in);
        
        
    
        int num1,num2,sum,sab,mul;
        float div,rem;
        System.out.print("Please Enter First Number: ");
        num1=input.nextInt();
        
        System.out.print("Please Enter Second Number: ");
        num2=input.nextInt();
        
        sum=num1+num2;
        System.out.println("summation: "+sum);
        
        sab=num1-num2;
        System.out.println("sabtraction: "+sab);
        
        mul=num1*num2;
        System.out.println("multiplaction: "+mul);
        
        div=num1/num2;
        System.out.println("divition: "+div);
        
        rem=num1%num2;
        System.out.println("remainder: "+rem);
    }
}
