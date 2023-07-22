import java.util.Scanner;
class practice3_18{
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        System.out.print("请输入月份：");
        int month = stdIn.nextInt();

        switch(month){
            case 3 :
            case 4 :
            case 5 : System.out.println("春季");  break;
            case 6 :
            case 7 :
            case 8 : System.out.println("夏季");  break;
            case 9 :
            case 10 :
            case 11 : System.out.println("秋季"); break;
            default :
                if(month == 1 || month == 2 || month == 12)
                    System.out.println("冬季");
                break;
        }
    }
}