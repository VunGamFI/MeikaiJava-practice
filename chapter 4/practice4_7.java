import java.util.Scanner;
class practice4_7{
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        System.out.print("要显示多少个呢：");
        int input = stdIn.nextInt();

        int i = 0;
        while(i < (input / 2)){
            System.out.print("*+");
            i++;
        }
        if(input % 2 == 0)
            System.out.println();
        else
            System.out.println('*');
    }
}