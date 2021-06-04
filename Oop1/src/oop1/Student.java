package oop1;

public class Student {
    String name;
    int id;
    String depertment;
    double sem1;
    double sem2;
    double sem3;
    
    public void CGPACalculation(){
        double avgCGPA=(sem1+sem2+sem3)/3;
        System.out.println(avgCGPA);
    }
}
