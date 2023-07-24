import java.util.Scanner;
class practice5_2{
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        System.out.println("变量x为float型，变量y为double型。");
        System.out.print("x：");
        float x = stdIn.nextFloat();
        System.out.print("y :");
        double y = stdIn.nextDouble();

        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}