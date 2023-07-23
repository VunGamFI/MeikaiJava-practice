import java.util.Scanner;
class practice4_11{
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        System.out.println("倒数。");
        int x;
        do{
            System.out.print("正整数值：");
            x = stdIn.nextInt();
        }while(x <= 0);
        for( ; x >= 0; x--)
            System.out.println(x);
    }
}