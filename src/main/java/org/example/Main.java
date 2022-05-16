package org.example;


public class Main {
    public static void main(String[] args) {
        org.example.Triangle triangle = new org.example.Triangle(2, 70, 4);
        double area = triangle.getArea();
        System.out.println("Площадь треугольника = " + area);
    }
}
