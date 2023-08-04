package practice10_4;

import java.util.GregorianCalendar;
import static java.util.GregorianCalendar.*;
import java.util.Scanner;
public class Day{
    Scanner stdIn = new Scanner(System.in);
    private static int[] countMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    GregorianCalendar today = new GregorianCalendar();
    int year = today.get(YEAR);
    int month = today.get(MONTH) + 1;
    int date = today.get(DATE);

    //构造函数
    public Day(){ }
    public Day(int year) { this.year = year; }
    //重置月数
    public Day(int year, int month){
        this(year);
        if(month < 1)   month = 1;
        if(month > 12)  month = 12;
        this.month = month;
    }
    //重置天数
    public Day(int year, int month, int date){
        this(year, month);
        if(date < 1)    date = 1;
        if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12){
            if(date > 31)   date = 31;
        }else if(month == 2){
            if(isLeap(year))    date = 29;
            else    date = 28;
        }else
            if(date > 30)   date = 30;
        this.date = date;
    }
    public Day(Day d) { this(d.year, d.month, d.date); }

    public void setYear(int year) { this.year = year; }
    public void setMonth(int month) { this.month = month; }
    public void setDate(int date) { this.date = date; }

    public int getYear() { return year; }
    public int getMonth() { return month; }
    public int getDay() { return date; }

    //计算平、闰年
    public static boolean isLeap(int y){
        return y % 4 == 0 && y % 100 != 0 || y % 400 == 0;
    }

    //计算过去的时间
    public static int pastTime(Day day){
        int pastTime = 0;
        if(day.getMonth() == 1)
            pastTime = day.getDay();
        else{
            if(isLeap(day.getYear()))
                countMonth[1] = 29;
            else
                countMonth[1] = 28;
            for(int i = 0; i <= day.getMonth() - 2; i++)
                pastTime += countMonth[i];
            pastTime += day.getDay();
        }
        return pastTime;
    }
    //计算剩余的时间
    public static int futureTime(Day day){
        int future;
        if(isLeap(day.getYear()))
            future = 366 - pastTime(day);
        else
            future = 365 - pastTime(day);
        return future;
    }

    //判断日期前后关系（实例方法）
    public void isLike(){
        Day day = new Day(year, month, date);
        System.out.print("年份：");    int y = stdIn.nextInt();
        System.out.print("月份：");    int m = stdIn.nextInt();
        System.out.print("日期：");    int d = stdIn.nextInt();
        Day test = new Day(y, m, d);
        isLike(day, test);
    }

    //判断日期前后关系（类方法）
    public static void isLike(Day a, Day b){
        if(a.getYear() > b.getYear())
            System.out.println(a + "是" + b + "之后的日期。");
        else if(a.getYear() == b.getYear()){
            if(pastTime(a) > pastTime(b))
                System.out.println(a + "是" + b + "之后的日期。");
            else if(pastTime(a) == pastTime(b))
                System.out.println(a + "和" + b + "日期相等。");
            else
                System.out.println(a + "是" + b + "之前的日期。");
        }else
            System.out.println(a + "是" + b + "之前的日期。");
    }

    //返回字符串表示
    public String toString() {
		return String.format("%04d年%02d月%02d日", year, month, date);
	}

    //日期推后n天
    public void back(Day d, int n){
        Day dayBack;
        int year, month, date;
        int daytemp;

        if(d.getDay() - n >= 0)
            dayBack = new Day(d.getYear(), d.getMonth(), d.getDay() - n);
        else{
            if(d.getMonth() != 1){
                year = d.getYear();
                month = d.getMonth() - 1;
            }
            else{
                year = d.getYear() - 1;
                month = 12;
            }

            if(d.getMonth() == 5 || d.getMonth() == 7 || d.getMonth() == 10 || d.getMonth() == 12)
                daytemp = 30;
            else if(d.getMonth() == 3){
                if(isLeap(d.getYear()))
                    daytemp = 29;
                else
                    daytemp = 28;
            }else{
                daytemp = 31;
            }
            date = daytemp - (n - d.getDay());
            dayBack = new Day(year, month, date);
        }
        System.out.println(d + "的前" + n + "天的日期是" + dayBack);
    }

    //日期前进n天
    public void future(Day d, int n){
        Day dayFuture;
        int year, month, date;
        int daytemp;
        if(
            d.getMonth() == 1 || d.getMonth() == 3 || d.getMonth() == 5 ||
            d.getMonth() == 7 || d.getMonth() == 8 || d.getMonth() == 10 || d.getDay() == 12
        )
            daytemp = 31;
        else if(d.getMonth() == 2){
            if(isLeap(d.getYear()))
                daytemp = 29;
            else
                daytemp = 28;
        }else
            daytemp = 30;
        if(d.getDay() + n > daytemp){
            if(d.getMonth() == 12){
                month = 1;
                year = d.getYear() + 1;
            }else{
                month = d.getMonth() + 1;
                year = d.getYear();
            }
            date = d.getDay() + n - daytemp;
        }else{
            date = d.getDay() + n;
            month = d.getMonth();
            year = d.getYear();
        }
        dayFuture = new Day(year, month, date);
        System.out.println(d + "的后" + n + "天的日期是" + dayFuture);
    }
}