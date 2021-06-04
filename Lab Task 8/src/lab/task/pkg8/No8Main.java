class Student_1 {
    int roll_no;
    int phone_num;
    String name;
    String address;
}
class student_2 {
    int roll_no;
    int phone_num;
    String name;
    String address;
}
 
package task.pkg2;
 
 
public class Task2 {
 
    
    public static void main(String[] args) {
        Student_1 s1 = new Student_1();
        
        s1.name="John";
        s1.roll_no=2;
        s1.address="Bogura";
        s1.phone_num= 31756873;
        
        student_2 s2 = new student_2();
        s2.name="Sam";
        s2.roll_no=3;
        s2.address="Rangpur";
        s2.phone_num= 32056466;
        
        System.out.println("Name is :"+s1.name+" Roll no :"+s1.roll_no+" Address : "+s1.address+" Phone number :" +s1.phone_num);
        System.out.println("Name is :"+s2.name+" Roll no :"+s2.roll_no+" Address : "+s2.address+" Phone number :" +s2.phone_num);
        
    }
    
}