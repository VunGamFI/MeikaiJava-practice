package practice13_4;

import practice13_4.Day;
import practice13_4.Human;

import java.util.Scanner;

class humanInfo {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        practice13_4.Human zhangsan = new practice13_4.Human("张三", 165, 40, new practice13_4.Day(1995, 9, 14));
        practice13_4.Human wangwu = new practice13_4.Human("王五", 170, 55, new practice13_4.Day(2003, 8, 9));

        System.out.print("名字：");
        String name = stdIn.nextLine();
        System.out.print("身高：");
        int height = stdIn.nextInt();
        System.out.print("体重：");
        int weight = stdIn.nextInt();
        System.out.print("出生年份：");
        int year = stdIn.nextInt();
        System.out.print("出生月份：");
        int month = stdIn.nextInt();
        System.out.print("出生日期：");
        int date = stdIn.nextInt();

        practice13_4.Human humaninfo_input = new Human(name, height, weight, new Day(year, month, date));

        System.out.println("张三的体重为" + zhangsan.getHeight() + "kg。");
        System.out.println("王五的身高为" + wangwu.getWeight() + "cm。");

        System.out.println();

        humaninfo_input.humaninfo();
        System.out.println("出生日期：" + humaninfo_input.getBirthday());
    }
}