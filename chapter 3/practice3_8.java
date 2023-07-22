import java.util.Scanner;
class practice3_8{
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        System.out.print("成绩：");
        int grade = stdIn.nextInt();
        if(grade >= 0 && grade <= 59)
            System.out.println("不及格。");
        else if(grade >= 60 && grade <= 69)
            System.out.println("及格。");
        else if(grade >=70 && grade <= 79)
            System.out.println("良");
        else if(grade >= 80 && grade <= 100)
            System.out.println("优。");
    }
}