package basicjava;

import java.util.Scanner;

public class SumOfArray {
    public static void main(String[] arg){
    Scanner input=new Scanner(System.in);
    int[][]A=new int[5][5];
    int i,j;
    
    for(i=0;i<5;i++){
        for(j=0;j<3;j++){
            System.out.printf("A[%d][%d]= ",i,j);
            A[i][j]=input.nextInt();
        }
        System.out.printf("\n");
    }
    
    for(i=0;i<5;i++){
        for(j=0;j<3;j++){
        System.out.printf("%d ",A[i][j]);
        }
        System.out.printf("\n");
    }
    }
}
