package practice9_1;

import java.util.Scanner;
class humaninfo2 {
    static Scanner stdIn = new Scanner(System.in);
    static String name;
    static String gender;
    static int height;
    static int weight;
    static int year;
    static int month;
    static int date;
    static boolean compDay(Human2 d1, Human2 d2){
        return d1.getYear() == d2.getYear() &&
                d1.getMonth() == d2.getMonth() &&
                d1.getDate() == d2.getDate();
    }

    static void input(){
        System.out.print("姓名：");
        name = stdIn.next();
        System.out.print("性别：");
        gender = stdIn.next();
        System.out.print("身高：");
        height = stdIn.nextInt();
        System.out.print("体重：");
        weight = stdIn.nextInt();
        System.out.print("出生年份：");
        year = stdIn.nextInt();
        System.out.print("出生月份：");
        month = stdIn.nextInt();
        System.out.print("出生日期：");
        date = stdIn.nextInt();
    }
    public static void main(String[] args){


        String[] wd = {"日", "一", "二", "三", "四", "五", "六" };
        Human2[] x = {new Human2("张三", "男", 170, 60, 1995, 2, 15),
                     new Human2("李四", "男", 160, 60, 1880, 7, 21),
                     new Human2("李林", "女", 166, 50, 1899, 5, 30),
                     new Human2("宁南", "女", 170, 55, 2001, 4, 7)
                    };

        for(int i = 0; i < x.length; i++){
            System.out.println("姓名：" + x[i].getName());
            System.out.println("性别：" + x[i].getGender());
            System.out.println("身高：" + x[i].getHeight());
            System.out.println("体重：" + x[i].getWeight());
            System.out.println("出生日期：" + x[i].getYear() +
                                "年" + x[i].getMonth() + "月" + x[i].getDate() + "日（" +
                                wd[x[i].dayOfWeek()] + "）"
                              );
        }

        input();
        Human2 human = new Human2(name, gender, height, weight, year, month, date);
        System.out.println("姓名：" + human.getName());
        System.out.println("性别：" + human.getGender());
        System.out.println("身高：" + human.getHeight());
        System.out.println("体重：" + human.getWeight());
        System.out.println("出生日期：" + human.getYear() +
                            "年" + human.getMonth() + "月" + human.getDate() + "日（" +
                            wd[human.dayOfWeek()] + "）"
                          );

        int count = 0;
        for(int i = 0; i < x.length; i++)
            if(compDay(human, x[i]))
                count++;
        if(count != 0)
            System.out.println("存在生日跟" + human.getName() + "相同的人。");
        else
            System.out.println("不存在生日跟" + human.getName() + "相同的人。");
    }
}