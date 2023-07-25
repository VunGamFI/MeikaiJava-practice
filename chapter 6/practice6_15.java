import java.util.Scanner;
import java.util.Random;
class practice6_15{
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        Random rand = new Random();

        String[] weekEN = {
                "monday", "tuesday", "wednesday", "thursday", "friday",
                "saturday", "sunday"
        };
        String[] weekCN = {
                "星期一", "星期二", "星期三", "星期四", "星期五", "星期六", "星期日"
        };
        System.out.println("请用小写输入英文的星期名。");

        int retry;
        int key = rand.nextInt(7) + 1;
        do{
            int n = rand.nextInt(7) + 1;
            while(key == n)
                n = rand.nextInt(7) + 1;
            key = n;
            System.out.print(weekCN[n - 1] + "：");

            String answer = stdIn.next();

            while(!(answer.equals(weekEN[n - 1]))){
                System.out.println("回答错误");
                System.out.print(weekCN[n - 1] + "：");
                answer = stdIn.next();
            }
            System.out.print("回答正确。再来一次？    1 --- Yes / 0 --- No：");
            retry = stdIn.nextInt();
        }while(retry == 1);
    }
}