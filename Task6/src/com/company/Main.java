package com.company;

public class Main {
    public static void main(String[] args) {

        RoundHole hole = new RoundHole(5);
        RoundPeg rpeg = new RoundPeg(5);
        if (hole.fits(rpeg)) {
            System.out.println("TRUE");
        }

        SquarePeg s = new SquarePeg(2);
        SquarePeg l = new SquarePeg(20);

        SquarePegAdapter smallSqPegAdapter = new SquarePegAdapter(s);
        SquarePegAdapter largeSqPegAdapter = new SquarePegAdapter(l);
        if (hole.fits(smallSqPegAdapter)) {
            System.out.println("TRUE");
        }
        if (!hole.fits(largeSqPegAdapter)) {
            System.out.println("FALSE");
        }

        EqualateralTrianglePeg hole = new EqualateralTrianglePeg(5);
        RoundPeg rpeg = new RoundPeg(5);
        if (hole.fits(rpeg)) {
            System.out.println("TRUE");
        }

    }
}
