import java.util.Scanner;
class practice3_4{
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        System.out.print("a：");
        int a = stdIn.nextInt();
        System.out.print("b：");
        int b = stdIn.nextInt();
        if(a == b)
            System.out.println("a和b相等。");
        else if(a > b)
            System.out.println("a更大。");
        else
            System.out.println("b更大。");
    }
}