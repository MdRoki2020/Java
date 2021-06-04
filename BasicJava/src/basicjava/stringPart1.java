package basicjava;

public class stringPart1 {
    public static void main(String[] args){
    
        String s1=("Rakibul Islam");
        String s2=new String("Rakibul Islam");
        
        int len=s1.length();
        
        System.out.println("s1= "+s1);
        System.out.println("S2= "+s2);
        System.out.println("Length of s1: "+len);
        
        if(s1.equalsIgnoreCase(s2)){
        System.out.println("Equal"); 
        }
        else{
                System.out.println("Not Equal");}
        
    }
}
