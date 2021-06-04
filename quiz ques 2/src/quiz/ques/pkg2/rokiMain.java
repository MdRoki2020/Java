
package quiz.ques.pkg2;



public class rokiMain {
    public static void main(String[] args){
    
        roki obj =new roki();
        obj.getId();
        obj.setId(20);
        obj.getAge();
        obj.setAge(30);
        obj.getBirthday();
        obj.setBirthday(2000);
        obj.getFull_name();
        obj.setFull_name("rakibul islam");
        
        System.out.println(obj.getId());
        System.out.println(obj.getAge());
        System.out.println(obj.getBirthday());
        System.out.println(obj.getFull_name());
    }
}
