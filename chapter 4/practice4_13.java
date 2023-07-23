import java.util.Scanner;
class practice4_13{
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        System.out.println("计算1到n的和");
        int n;
        int sum = 0;
        do{
            System.out.print("n的值：");
            n = stdIn.nextInt();
        }while(n <= 0);
        for(int i = 1; i <= n; sum += i, i++)
            ;
        System.out.println("1到" + n + "的和是" + sum + "。");
    }
}