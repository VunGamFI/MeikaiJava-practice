import java.util.Random;
import java.util.Scanner;
class practice2_8{
    public static void main(String[] args){
        Random rand = new Random();
        Scanner stdIn = new Scanner(System.in);
        System.out.print("整数值：");
        int input = stdIn.nextInt();
        int random = rand.nextInt(11) - 5;
        System.out.println("该值加减5范围的随机数是：" + (input + random));
    }
}
