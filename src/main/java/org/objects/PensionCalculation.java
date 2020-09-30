package org.objects;

public class PensionCalculation {
    public String name;
    public Integer yearOfJoining;
    public Double salary;
    public Double gpf;
    public static Double pensionFund = 0.0;

    public double getPensionAmmount()
    {
       if(yearOfJoining <= 2004)
       {
           gpf = 20*(salary/100);
           pensionFund = pensionFund + gpf;
           return pensionFund;
       }
       return 0;

    }
}
