import java.util.Scanner;
class practice7_31{
    static int absolute(int x){
        if(x < 0)   x = -x;
        return x;
    }
    static long absolute(long x){
        if(x < 0)   x = -x;
        return x;
    }
    static float absolute(float x){
        if(x < 0)   x = -x;
        return x;
    }
    static double absolute(double x){
        if(x < 0)   x = -x;
        return x;
    }

    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        System.out.print("int型整数的值：");
        int input_1 = stdIn.nextInt();
        System.out.println("绝对值为" + absolute(input_1) + "。");

        System.out.print("long型整数的值：");
        long input_2 = stdIn.nextLong();
        System.out.println("绝对值为" + absolute(input_2) + "。");

        System.out.print("float型实数的值：");
        float input_3 = stdIn.nextFloat();
        System.out.println("绝对值为" + absolute(input_3) + "。");

        System.out.print("double型实数的值：");
        double input_4 = stdIn.nextDouble();
        System.out.println("绝对值为" + absolute(input_4) + "。");


    }
}