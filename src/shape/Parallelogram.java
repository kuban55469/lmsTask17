package shape;

import java.util.Scanner;

public class Parallelogram extends Shape{
    Scanner scanner = new Scanner(System.in);
    @Override
    public double getPerimeter() {// P = 2 * (a+b)
        double p = 0;
        double a = scanner.nextDouble(), b = scanner.nextDouble();
        p = 2 * (a + b) ;
        return p;
    }
}
