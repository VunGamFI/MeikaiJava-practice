package practice13_3;

import java.util.Scanner;
public class Human extends Player{
    Scanner stdIn = new Scanner(System.in);

    private int hand;

    public Human() {
        System.out.print("请选择手势（0 --- 石头 / 1 --- 剪刀 / 2 --- 布）：");
        hand = stdIn.nextInt();
        while(!(hand == 0 || hand == 1 || hand == 2)){
            System.out.print("请选择手势（0 --- 石头 / 1 --- 剪刀 / 2 --- 布）：");
            hand = stdIn.nextInt();
        }
        setHand(hand);
    }

    public String toString(){
        return "人的手势：";
    }
}