package com.company;

public class Square {
    int sideLength;

    public Square() {
    }

    public Square(int sideLength) {
        this.sideLength = sideLength;
    }

    public int getSideLength() {
        return sideLength;
    }

    public void setSideLength(int sideLength) {
        this.sideLength = sideLength;
    }

    public int getPerimeter() {
        return this.getSideLength() * 2;
    }

    public  double getArea(){
        return Math.pow(this.getSideLength(),2);
    }

    public double getDiagonal(){
        return this.getSideLength()*Math.sqrt(2);
    }

    public double getRadiusOfCircumscribedCircle(){
        return this.getDiagonal()/2;
    }

    public double getRadiusOfInscribedCircle(){
        return this.sideLength/2;
    }

    public void drawSquare() throws InterruptedException {
        System.out.print(" ");
        for (int i = 0; i < this.getSideLength(); i++) {
            Thread.sleep(500);
            System.out.print(" — ");
        }
        System.out.println("");
        for (int j = this.getSideLength()-1; j >=0; j--) {
            Thread.sleep(500);
            System.out.print("ǀ");
            for (int k = 0; k < this.getSideLength(); k++) {
                System.out.print("   ");
            }
            System.out.println("ǀ");
        }
        System.out.print(" ");
        for (int i = 0; i < this.getSideLength(); i++) {
            Thread.sleep(500);
            System.out.print(" — ");
        }
    }

}
