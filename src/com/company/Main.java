package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Scanner in = new Scanner(System.in);
        System.out.print("Введіть довжину сторони квадрата: ");
        int sideLength = in.nextInt();
        Square mySquare = new Square(sideLength);

        int perimeter = mySquare.getPerimeter();
        double area = mySquare.getArea();
        double diagonal = mySquare.getDiagonal();
        double radiusOfCircumscribedCircle = mySquare.getRadiusOfCircumscribedCircle();
        double radiusOfInscribedCircle = mySquare.getRadiusOfInscribedCircle();

        System.out.println("Довжина сторони: " + mySquare.getSideLength() +
                "\nПериметр: " + perimeter +
                "\nПлоща: " + area +
                "\nДіагональ: " + diagonal +
                "\nРадіус описаного кола: " + radiusOfCircumscribedCircle +
                "\nРадіус вписаного кола: " + radiusOfInscribedCircle);
        mySquare.drawSquare();
    }
}
