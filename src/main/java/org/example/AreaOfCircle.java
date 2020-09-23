package org.example;

import java.text.NumberFormat;
import java.util.Scanner;

class AreaOfCircle {
    public static void main(String[] args) {
        final double PI=3.14;
        double r;
        Scanner in=new Scanner(System.in);
        System.out.print("enter the radius of the circle");
        r=in.nextDouble();
        double area=PI*r*r;
        System.out.println("Area of the circle="+area);
        NumberFormat obj=NumberFormat.getCompactNumberInstance();
        obj.setMaximumFractionDigits(2);
        obj.setMinimumIntegerDigits(7);
        String str=obj.format(area);
        System.out.println("You can read as:"+str);
    }
}
