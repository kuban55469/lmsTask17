import shape.Parallelogram;
import shape.Pentagon;
import shape.Square;
import shape.Triangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите стороны треугольника: ");
        Triangle triangle = new Triangle();
        System.out.println("Периметр равен: " + triangle.getPerimeter() + "\nВведите стороны треугольника: ");
        triangle.getSquare();

        System.out.println("Введите стороны квадрата: ");
        Square square = new Square();
        System.out.println("Периметр равен:" + square.getPerimeter() + "\nВведи сторону квадрата: " );
        System.out.println("Площадь равен: " + square.getSquare());


        System.out.println("Введите стороны пятиугольника: ");
        Pentagon pentagon = new Pentagon();
        System.out.println("Периметр равен: " + pentagon.getPerimeter() );


        System.out.println("Введите стороны параллелеграмма: ");
        Parallelogram parallelogram = new Parallelogram();
        System.out.println("Периметр равен: " + parallelogram.getPerimeter() );


    }
}