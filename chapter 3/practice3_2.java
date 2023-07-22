import java.util.Scanner;
class practice3_2{
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        System.out.print("整数A：");
        int a = stdIn.nextInt();
        System.out.print("整数B：");
        int b = stdIn.nextInt();
        if(a > 0 && b > 0 && a % b == 0)
            System.out.println("B是A的约数。");
        else
            System.out.println("B不是A的约数。");
    }
}