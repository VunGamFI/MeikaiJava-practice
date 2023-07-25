import java.util.Scanner;
import java.util.Random;
class practice6_14{
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        Random rand = new Random();

        String[] month = {
                "January", "February", "March", "April", "May", "June", "July",
                "August", "September", "October", "November", "December"
        };

        System.out.println("请输入月份的英语表达。");
        System.out.println("另外，首字母大写，之后的字母都小写");

        int retery;
        int key = rand.nextInt(12) + 1;
        do{
            int RandMonth = rand.nextInt(12) + 1;
            while(key == RandMonth){
                RandMonth = rand.nextInt(12) + 1;
            }
            key = RandMonth;
            System.out.print(RandMonth + "月：");
            String answer = stdIn.next();

            while(!answer.equals(month[RandMonth - 1])){
                System.out.println("回答错误。");
                System.out.print(RandMonth + "月：");
                answer = stdIn.next();
            }
            System.out.print("回答正确。再来一次？    1 --- Yes / 0 --- No：");
            retery = stdIn.nextInt();
        }while(retery == 1);
    }
}