import java.util.Scanner;
class practice3_7{
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        System.out.print("正整数值：");
        int input = stdIn.nextInt();
        if(input > 0)
            if(input % 3 == 0)
                System.out.println("该值能被3整除。");
            else if(input % 3 == 1)
                System.out.println("该值除于3余1。");
            else
                System.out.println("该值除于3余2。");
        else
            System.out.println("输入的值不是正值。");
    }
}