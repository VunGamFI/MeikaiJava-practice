import java.util.Scanner;
class practice4_9{
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        int n;
        do {
            System.out.print("n的值：");
            n = stdIn.nextInt();
        }while(n <= 0);
        int i = 1;
        int product = 1;
        while(i <= n){
            product *= i;
            i++;
        }
        System.out.println("1到" + n + "的积为" + product + "。");
    }
}