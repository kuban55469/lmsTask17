package shape;

import java.util.Scanner;

public class Triangle extends Shape{

    Scanner scanner = new Scanner(System.in);
    @Override
    public  double getPerimeter() { // P = a + b + c
        double p = 0;
        double a = scanner.nextDouble(), b = scanner.nextDouble(), c = scanner.nextDouble();
        p = a + b + c;
        return p;
    }
    public void getSquare(){ // S = P* (P-a)*(P-b)*(P-c)
        double p = 0, s = 0;
        double a = scanner.nextDouble(), b = scanner.nextDouble(), c = scanner.nextDouble();
        p = (a + b + c) / 2;
        s = p * (p-a) * (p-b) * (p-c);
        System.out.println("Площадь треугольника равен: " + Math.sqrt(s));
    }
}
