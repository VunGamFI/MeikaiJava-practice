import java.util.Scanner;
class practice3_6{
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        System.out.print("输入正整数值：");
        int input = stdIn.nextInt();
        if(input > 0)
            if(input % 10 == 0)
                System.out.println("该值是10的倍数。");
            else
                System.out.println("该值不是10的倍数。");
        else
            System.out.println("输入的不是正值");
    }
}