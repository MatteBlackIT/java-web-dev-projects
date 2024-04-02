package org.launchcode;

import java.util.Scanner;
public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//LENGTH
        System.out.println("What is the length of this rectangle? : ");
        Double length = input.nextDouble();
//WIDTH
        System.out.println("What is the width of this rectangle? : ");
        Double width = input.nextDouble();

        Double area = (length * width);

        System.out.println("The area of the rectangle is: " + area);


    }
}