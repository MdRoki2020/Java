
package basicjava;

public class LinearSearch {
    public static void main(String[] args){
    int[] nums={22,40,10,33,55,84,-55,20,30,10,11,90};
    int searchItem=84;
    
    for(int i=0;i<nums.length;i++){
    if(nums[i]==searchItem){
    System.out.println("Item found index "+i);
    return;
    }
    }
    System.out.println("Item Not Found");
    }
    }
