import java.util.Scanner;
class practice4_17{
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        System.out.print("整数值：");
        int n = stdIn.nextInt();
        int j = 0;
        for(int i = 1; i <= n; i++)
            if(n % i == 0){
                System.out.println(i);
                j++;
            }
        System.out.println("约数有" + j + "个。");
    }
}