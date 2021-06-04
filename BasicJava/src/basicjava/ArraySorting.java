package basicjava;

import java.util.Arrays;

public class ArraySorting {
    public static void main(String[] args){
        int[] number={-3,4,5,3,10};
        Arrays.sort(number);
        
        for(int i=0;i<5;i++){
        System.out.print(" "+number[i]);
        }
        
    }
}
