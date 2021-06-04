package basicoop;

import java.util.Scanner;

public class ElectricityUnitCharges {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Please Enter unit: ");
        int unit=input.nextInt();
        float amt, total_amt, sur_charge;
        
        if(unit <= 50)
    {
        amt = (float) (unit * 0.50);
    }
    else if(unit <= 150)
    {
        amt = (float) (25 + ((unit-50) * 0.75));
    }
    else if(unit <= 250)
    {
        amt = (float) (100 + ((unit-150) * 1.20));
    }
    else
    {
        amt = (float) (220 + ((unit-250) * 1.50));
    }
        
    sur_charge = (float) (amt * 0.20);
    total_amt  = amt + sur_charge;
    
    System.out.println("Electricity Bill ="+total_amt);
        
    }
}
