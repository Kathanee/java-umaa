package org.objects;

public class PensionCalculationmain {
    public static void main(String[] args) {

        PensionCalculation pensionCalculationRameswar = new PensionCalculation();
        pensionCalculationRameswar.name = "Rameswar Hota";
        pensionCalculationRameswar.yearOfJoining=1990;
        pensionCalculationRameswar.salary=50000.50;
        System.out.println("Mr." + pensionCalculationRameswar.name + " will get Rs " + pensionCalculationRameswar.getPensionAmmount() + " a month as pension income.");
    }
}
