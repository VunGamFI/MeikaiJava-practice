import java.util.Scanner;
class practice5_1{
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        System.out.print("整数：");
        int input = stdIn.nextInt();
        System.out.printf("用八进制数表示为%o。\n", input);
        System.out.printf("用十六进制数表示为%x。", input);
    }
}