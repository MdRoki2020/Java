package basicoop;

import static java.lang.Math.sqrt;
import java.util.Scanner;

public class equilateral {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Please Enter side of an equilateral triangle: ");
        float side=input.nextInt();
        float area = (float) ((sqrt(3) / 4) * (side * side));
        System.out.println("Area of equilateral triangle: "+area);
    } 
}
