import java.util.Scanner;
class practice4_18{
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        int input;
        do{
            System.out.print("整数值：");
            input = stdIn.nextInt();
        }while(input <= 0);
        for(int i = 1; i <= input; i++)
            System.out.println(i + "的平方是" + (i * i));
    }
}