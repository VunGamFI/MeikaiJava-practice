package practice8_2;

import java.util.Scanner;

class Car{
    Scanner stdIn = new Scanner(System.in);
    int answer;
    private String name;
    private int width;
    private int height;
    private int length;
    private double x;
    private double y;
    private double fuel;
    private double fuel_capacity;   //油箱容量
    private String carnumber;   //车牌号
    private double fuelcost;    //燃料费用
    private double refuel;  //加油
    private double refuelcost;  //加油费用

    Car(
            String name, String carnumber, double fuel_capacity, int width, int height, int length,
            double fuel
    ){
        this.name = name;   this.carnumber = carnumber; this.fuel_capacity = fuel_capacity;
        this.width = width; this.height = height;   this.length = length;   this.fuel = fuel;

        x = y = 0.0;
    }

    double getX() {   return x;   }
    double getY() {  return y;   }
    double getFuel() {   return fuel;    }
    double getRefuelcost() {    return refuelcost;  };

    void putspec(){
        System.out.println("名称：" + name);
        System.out.println("车牌号" + carnumber);
        System.out.println("油箱容量" + fuel_capacity + "L");
        System.out.println("车宽" + width + "mm");
        System.out.println("车高" + height + "mm");
        System.out.println("车长" + length + "mm");
    }

    boolean move(double dx, double dy){
        double dist = Math.sqrt(dx * dx + dy * dy);
        System.out.print("当前油价：");
        fuelcost = stdIn.nextDouble();
        refuelcost = 0;
        if(dist > fuel){
            System.out.print("是否加满油？   1 -- Yes / 0 -- No：");
            answer = stdIn.nextInt();
            if(answer == 1){
                refuel = fuel_capacity - fuel;  //加油量
                refuelcost = refuel * fuelcost; //加油费用
                fuel = fuel_capacity;   //加完油后的油量
                fuel -= dist;
                x += dx;
                y += dy;
                return true;
            }else
                return false;
        }else{
            fuel -= dist;
            while(fuel == dist){
                System.out.print("是否加满油？   1 -- Yes / 0 -- No：");
                answer = stdIn.nextInt();
                if(answer == 1){
                    fuel = fuel_capacity;   //加完油后的油量
                    refuel = fuel_capacity; //加油量
                    refuelcost = refuel * fuelcost; //加油费用
                }else
                    return false;
            }
            x += dx;
            y += dy;
            return true;
        }
    }
}
