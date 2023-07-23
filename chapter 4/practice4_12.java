import java.util.Scanner;
class practice4_12{
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        System.out.println("正数。");
        int x;
        do{
            System.out.print("正整数值：");
            x = stdIn.nextInt();
        }while(x <= 0);
        for(int i = 0; i <= x; i++)
            System.out.println(i);
    }
}