
package loop;

public class NewLoopClass {
    public void forLoop(){
    int i;
    String[] alphabet={"A","B","C","D","E","F"};
    for(i=0;i<alphabet.length;i++){
        
    if(i==2){
    continue;
    }
    
    System.out.println(alphabet[i]);
    }
}
    
    public void whileLoop(){
    int i;
    String[] alphabet={"A","B","C","D","E","F"};
    i=0;
    while(i<alphabet.length){
        
    if(i==2){
    break;
    }
    
    System.out.println(alphabet[i]);
    i++;
    }
}
    
    public void doLoop(){
    int i;
    i=0;
    String[] alphabet={"A","B","C","D","E","F"};
    do{
    System.out.println(alphabet[i]);
    i++;
    }while(i<alphabet.length);
    }
}
