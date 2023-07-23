import java.util.Scanner;
import java.util.Random;
class practice4_27{
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("猜数字游戏开始！");
        System.out.println("请猜一个0～99的数字。");
        int RandNum = rand.nextInt(100);
        int input;

        for(int i = 1; i <= 5; i++){
            System.out.print("是多少呢：");
            input = stdIn.nextInt();
            if(input > RandNum)
                System.out.println("比这个数小哟。");
            else if(input < RandNum)
                System.out.println("比这个数大哟。");
            else{
                System.out.println("回答正确。");
                break;
            }
            if(i == 5){
                System.out.println("回答次数用完，游戏结束。");
                System.out.println("正确答案为：" + RandNum + "。");
            }
        }
    }
}