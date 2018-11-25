package com.company;

public class EqualateralTrianglePeg extends RoundPeg {
    private double side;

    public EqualateralTrianglePeg (double side){
        this.side = side;
    }
    public double getSide() {
        return side;
    }

    public double getArea() {
       double result;
       result = Math.sqrt(3)/4 * getSide()*getSide() ;
       return result;
    }

}
