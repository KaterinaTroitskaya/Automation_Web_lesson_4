package org.example;

public class Triangle {
    public static double side1;
    public static double side2;
    public static double side3;


    public Triangle(double side1, double side2, double side3) {
        if (isValid(side1, side2, side3)) {

            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;

        } else {
            System.out.println("Заданы некорректные длины сторон треугольника");
        }
    }

    public boolean isValid(double side1, double side2, double side3) {
        if (side1 > (side2 - side3) &&
                side1 > (side3 - side2) &&
                side2 > (side1 - side3) &&
                side2 > (side3 - side1) &&
                side3 > (side1 - side2) &&
                side3 > (side2 - side1) &&
                side1 < (side2 + side3) &&
                side2 < (side1 + side3) &&
                side3 < (side1 + side2)) {
            return true;
        }

        return false;
    }


        public static double getArea() {
            double area, s;
            s = side1 + side2 + side3;
            area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
            return (area);

        }

}
