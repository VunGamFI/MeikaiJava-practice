import java.util.Scanner;
class practice7_1{
    static int signOf(int n){
        if(n > 0)
            return 1;
        else if(n == 0)
            return 0;
        else
            return -1;
    }
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        System.out.print("整数：");
        int input = stdIn.nextInt();
        System.out.println("返回值为" + signOf(input) + "。");
    }
}
