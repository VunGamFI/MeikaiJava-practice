import java.util.Scanner;
class practice3_11{
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        System.out.print("整数A：");
        int A = stdIn.nextInt();
        System.out.print("整数B：");
        int B = stdIn.nextInt();

        int diff = A >  B ? (A - B) : (B - A);
        if(diff <= 10)
            System.out.println("它们的差值小于等于10.");
        else
            System.out.println("它们的差值大于10.");
    }
}