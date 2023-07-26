import java.util.Scanner;
class practice7_3{
    static int med(int a, int b, int c){
        int mid;
        if((a >= b && a <= c) || (a >= c && a <= b))
            mid = a;
        else if((b >= a && b <= c) || (b >= c && b <= a))
            mid = b;
        else
            mid = c;
        return mid;
    }

    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        int[] input = new int[3];

        for(int i = 0; i < 3; i++){
            System.out.print("第" + (i + 1) + "个整数：");
            input[i] = stdIn.nextInt();
        }
        System.out.println("中间值为" + med(input[0], input[1], input[2]));
    }
}