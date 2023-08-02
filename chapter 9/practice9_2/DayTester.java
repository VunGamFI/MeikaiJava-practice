package practice9_2;
import java.util.Scanner;
class DatTest{
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        Day[] day = new Day[6];
        day[0] = new Day();
        day[1] = new Day(1995);
        day[2] = new Day(1994, 2);
        day[3] = new Day(2000, 5, 10);
        day[4] = new Day(day[1].getYear(), day[2].getMonth(), day[3].getDate());
        day[5] = new Day(day[4]);

        System.out.print("年：");
        int year = stdIn.nextInt();
        System.out.print("月：");
        int month = stdIn.nextInt();
        System.out.print("日：");
        int date = stdIn.nextInt();
        day[0].set(year, month, date);

        for(int i = 0; i < 6; i++){
            System.out.println("day" + i + " = " + day[i]);
        }

        day[5].setYear(day[3].getYear());
        day[5].setMonth(day[0].getMonth());
        day[5].setDate(30);

        System.out.println("day[5]修改后的日期为：" + day[5]);

        int count = 0;
        for(int i = 1; i < 6; i++)
            if(day[0].equalTo(day[i]))
                count++;
        if(count != 0)
            System.out.println("有跟day[0]相等的日期。");
        else
            System.out.print("没有跟day[0]相等的日期。");
    }
}