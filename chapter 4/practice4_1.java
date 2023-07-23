import java.util.Scanner;
class practice4_1{
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        int retry;
        do{
            System.out.print("整数值：");
            int n = stdIn.nextInt();

            if(n > 0)
                System.out.println("该值为正。");
            else if(n < 0)
                System.out.println("该值为负。");
            else
                System.out.println("该值为0。");

            System.out.print("要重复一次吗？   1 - Yes / 0 - No：");
            retry = stdIn.nextInt();
        }while(retry == 1);
    }
}
