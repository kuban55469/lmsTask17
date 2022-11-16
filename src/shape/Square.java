package shape;

import java.util.Scanner;

public class Square extends Shape{
    Scanner sc = new Scanner(System.in);
    @Override
    public double getPerimeter() {
        double p = 0;
        double a = sc.nextDouble();
         p = a * 4;
        return p ;
    }
    public double getSquare(){
        double a = sc.nextDouble(), s = a * a;
        return s;
    }
}
