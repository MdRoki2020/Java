package basicoop;

import java.util.Scanner;

public class isoscele {
    public static void main(String args[]) 
    {   
       
         Scanner s= new Scanner(System.in);
        
         System.out.print("Please Enter the length of same sided ");
         
         double a= s.nextDouble();
         
         System.out.print("Please Enter the side2 of the Triangle ");
         
         double b= s.nextDouble();
 
         double  area=(b/4)*Math.sqrt((4*a*a)-(b*b));
      
         System.out.println("Area of Isosceles Triangle: " + area);
   }
}
