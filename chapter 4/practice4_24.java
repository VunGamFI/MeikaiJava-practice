import java.util.Scanner;
class practice4_24{
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        System.out.print("正整数：");
        int input = stdIn.nextInt();
        int count = 0;

        for(int i = 2; i < input; i++){
            if(input % i == 0){
                System.out.println(input + "不是质数。");
                count++;
                break;
            }
        }
        if(count != 1)
            System.out.println(input + "是质数。");
    }
}