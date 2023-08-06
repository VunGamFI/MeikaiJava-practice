package practice12_1;

import practice12_1.CarSub;
public class carTest{
    public static void main(String[] args){
        Day d = new Day(2010, 10, 15);
        CarSub myCar = new CarSub("爱车", 1885, 1490, 5220, 90.0, d, 0);

        Day p = myCar.getPurchaseDay();
        System.out.println("爱车的购买日期：" + p);
        p.set(1999, 12, 31);
        Day q = myCar.getPurchaseDay();
        System.out.println("爱车的购买日期：" + q);

        myCar.setDistant();
        System.out.println("移动距离：" + myCar.getDistant());
    }
}
