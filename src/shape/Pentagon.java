package shape;

import java.util.Scanner;

public class Pentagon extends Shape{
    Scanner scanner = new Scanner(System.in);
    @Override
    public double getPerimeter() {
        double p = 0;
        double a = scanner.nextDouble(), b = scanner.nextDouble(), c = scanner.nextDouble(),
                d = scanner.nextDouble(), e = scanner.nextDouble();
        p = a + b + c + d + e;
        return p;
    }
}
