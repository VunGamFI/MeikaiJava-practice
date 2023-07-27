import java.util.Scanner;
class practice7_9{
    static Scanner stdIn = new Scanner(System.in);
    static int readPlusInt(){
        int input;
        while(true) {
            System.out.print("正整数值：");
            input = stdIn.nextInt();
            if(input > 0)
                break;
        }
        return input;
    }

    public static void main(String[] args){
        readPlusInt();
    }
}