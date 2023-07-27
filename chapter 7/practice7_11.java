import java.util.Scanner;
class practice7_11{
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        System.out.print("整数：");
        int input = stdIn.nextInt();
        System.out.print("移位的位数：");
        int n = stdIn.nextInt();

        int MoveRIndex = input;
        int MoveLIndex = input;
        int MoveR = input >> n;
        int MoveL = input << n;

        for(int i = 0; i < n; i++){
            MoveRIndex /= 2;
            MoveLIndex *= 2;
        }
        System.out.println("向右移动" + n + "位后的数为" + MoveR);
        System.out.println("指数运算后的值为" + MoveRIndex);
        System.out.println("向左移动" + n + "位后的数为" + MoveL);
        System.out.println("指数运算后的值为" + MoveLIndex);
    }
}