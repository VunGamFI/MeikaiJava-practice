package practice9_5;
import java.util.Scanner;
class periodTest{
    static Scanner stdIn = new Scanner(System.in);
    static int year, month, date;
    static void input(){
        System.out.print("年份：");
        year = stdIn.nextInt();
        System.out.print("月份：");
        month = stdIn.nextInt();
        System.out.print("日期：");
        date = stdIn.nextInt();
    }

    public static void main(String[] args){
        System.out.println("请输入开始日期。");
        input();
        Day from = new Day(year, month, date);
        System.out.println("请输入结束日期。");
        input();
        Day to = new Day(year, month, date);
        Period time = new Period(from, to);

        System.out.println("两日期构成的期间为" + time);
    }
}