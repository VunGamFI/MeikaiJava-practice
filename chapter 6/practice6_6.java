import java.util.Scanner;
class practice6_6{
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        System.out.print("总人数：");
        int number = stdIn.nextInt();

        int[] score = new int[number];

        for(int i = 0; i < number; i++){
            System.out.print(i + 1 + "号的分数：");
            score[i] = stdIn.nextInt();
        }

        int max = score[0], min = score[0], sum = score[0];
        for(int i = 1; i < number; i++){
            if(max < score[i])  max = score[i];
            if(min > score[i])  min = score[i];
            sum += score[i];
        }
        System.out.println("总分为" + sum + "。");
        System.out.println("平均分为" + (float)sum / number + "。");
        System.out.println("最高分为" + max + "。");
        System.out.println("最低分为" + min + "。");
    }
}