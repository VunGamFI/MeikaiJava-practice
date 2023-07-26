import java.util.Scanner;
class practice7_4{
    static int sumUp(int n){
        int sum = 0;
        for(int i = 1; i <= n; i++)
            sum += i;
        return sum;
    }

    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        System.out.print("累加到：");
        int n = stdIn.nextInt();

        System.out.println("从 1 到 " + n + " 的所有整数和为" + sumUp(n) + "。");
    }
}