
package basicoop;
public class series1 {
 static int sumOfSeries(int n) 
{ 
    int sum = 0; 
    for (int i = 1; i <= n; i++) 
       sum = sum + (2 * i - 1) * (2 * i - 1); 
    return sum; 
}
 
 public static void main(String[] args){
    int n = 10; 
    System.out.println( sumOfSeries(n));
 }
 
}
