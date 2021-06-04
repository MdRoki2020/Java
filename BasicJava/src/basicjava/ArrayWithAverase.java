package basicjava;

import java.util.Scanner;

public class ArrayWithAverase {
    public static void main(String[] arg){
    Scanner input=new Scanner(System.in);
    
    double number[][] = new double[5][5];
    int i,j;
    double sum=0;
    
    //take for input
    for(i=0;i<5;i++){
    for(j=0;j<5;j++){
    System.out.printf("number[%d][%d]= ",i,j);
    number[i][j]=input.nextDouble();
    }
    }
    
    //display for input
    for(i=0;i<5;i++){
    for(j=0;j<5;j++){
    System.out.printf("%d",number[i][j]);
    }
    }
    }
}
