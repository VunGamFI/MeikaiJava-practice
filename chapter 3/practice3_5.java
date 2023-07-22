import java.util.Scanner;
class practice3_5{
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        System.out.print("请输入正整数：");
        int input = stdIn.nextInt();
        if(input <= 0)
            System.out.println("输入的不是正值。");
        else if(input % 5 == 0)
            System.out.println("该值可以被5整除。");
        else
            System.out.println("该值不可以被5整除。");
    }
}