package practice12_1;

import java.util.Scanner;
public class CarSub extends Car{
    Scanner stdIn = new Scanner(System.in);
    double distant = 0;
    CarSub(String name, int width, int height, int length, double fuel, Day purchaseDay, double distant){
        super(name, width, height, length, fuel, purchaseDay);
        this.distant = distant;
    }

    public void setDistant(){
        System.out.print("x方向的移动距离：");
        double x = stdIn.nextDouble();
        System.out.print("y方向的移动距离：");
        double y = stdIn.nextDouble();
        if(move(x, y))
            distant = distant + Math.sqrt(x * x + y * y);
    }
    public double getDistant(){
        return distant;
    }
}