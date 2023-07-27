import java.util.Random;
import java.util.Scanner;
class practice7_8{
    static int random(int a, int b){
        Random rand = new Random();
        int n;
        if(a > b)
            n = a;
        else{
            n = rand.nextInt(b);
            while(n < a)
                n = rand.nextInt(b);
        }
        return n;
    }

    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        System.out.print("第一个整数：");
        int input_1 = stdIn.nextInt();
        System.out.print("第二个整数：");
        int input_2 = stdIn.nextInt();

        System.out.println("生成的随机数为" + random(input_1, input_2));
    }
}