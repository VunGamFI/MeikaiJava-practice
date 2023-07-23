import java.util.Scanner;
class practice4_3{
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        System.out.print("整数A：");
        int A = stdIn.nextInt();
        System.out.print("整数B：");
        int B = stdIn.nextInt();

        int min = A > B ? B : A;
        int max = A > B ? A : B;

        do{
            System.out.print(min + " ");
            min ++;
        }while(min <= max);
    }
}