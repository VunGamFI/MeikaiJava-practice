import java.util.Scanner;
class practice4_8{
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        System.out.print("整数值：");
        int input = stdIn.nextInt();
        int i = 1;
        while(input / 10 != 0){
            i++;
            input /= 10;
        }
        System.out.println("该值为" + i + "位数。");
    }
}