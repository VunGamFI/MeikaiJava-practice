import java.util.Scanner;
class practice7_6 {
    static void printSeason(int m){
        if(m >= 3 && m <= 5)
            System.out.println("春天");
        else if(m >= 6 && m <= 8)
            System.out.println("夏天");
        else if(m >= 9 && m <= 11)
            System.out.println("秋天");
        else if(m == 1 || m == 2 || m == 12)
            System.out.println("冬天");
    }

    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        System.out.print("月份：");
        int month = stdIn.nextInt();
        printSeason(month);
    }
}