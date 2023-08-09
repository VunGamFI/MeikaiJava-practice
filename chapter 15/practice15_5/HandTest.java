package practice15_5;

import java.util.Scanner;
class HandTest{
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        int retry;
        String[] hands = {"石头", "剪刀", "布"};

        do{
            Player[] computer = new Computer[2];
            computer[0] = new Computer();
            computer[1] = new Computer();
            Human user = new Human();

            System.out.println("电脑1出" + hands[computer[0].getHand()] +
                                "，电脑2出" + hands[computer[1].getHand()] +
                                "，玩家出" + hands[user.getHand()] + "。");

            //判断
            int[] judge = new int[2];
            for(int i = 0; i < 2; i++)
                judge[i] = (user.getHand() - computer[i].getHand() + 3) % 3;

            if(judge[0] == 0 && judge[1] == 2 || judge[1] == 0 && judge[0] == 2 || judge[0] == 2 && judge[1] == 2)
                System.out.println("你赢了。");
            else if(judge[0] == 0 && judge[1] == 0)
                System.out.println("平局。");
            else
                System.out.println("你输了。");

            do{
                System.out.print("再来一次？ (0) 否   (1) 是：");
                retry = stdIn.nextInt();
            }while(retry != 0 && retry != 1);
        }while(retry == 1);
    }
}