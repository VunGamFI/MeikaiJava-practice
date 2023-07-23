import java.util.Scanner;
import java.util.Random;

class practice4_2{
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        Random rand = new Random();
        int input;
        int RanNum = rand.nextInt(90) + 10;
        do{
            System.out.print("这个数是：");
            input = stdIn.nextInt();
            if(input > RanNum)
                System.out.println("比这个数小。");
            else if(input < RanNum)
                System.out.println("比这个数大。");
        }while(input != RanNum);
        System.out.println("猜对了，这个数是" + input + "。");
    }
}