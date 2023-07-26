import java.util.Scanner;
class practice6_17{
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        int[][] score = new int[6][2];
        int[] each_sum = new int[6];
        String[] subject = {"语文", "数学"};
        int sum_literary = 0, sum_math = 0;

        for(int i = 0; i < 6; i++)
            for(int j = 0; j < 2; j++){
                System.out.print("第" + (i + 1) + "位同学的" + subject[j] + "成绩：");
                score[i][j] = stdIn.nextInt();
            }

        for(int i = 0; i < 6; i++){
            sum_literary += score[i][0];
            sum_math += score[i][1];
        }
        for(int i = 0; i < 6; i++)
            each_sum[i] = score[i][0] + score[i][1];

        System.out.println("语文成绩的平均分为" + (double)sum_literary / 6);
        System.out.println("数学成绩的平均分为" + (double)sum_math / 6);
        for(int i = 0; i < 6; i++)
            System.out.println("第" + (i + 1) + "位同学的平均分为" + (double)each_sum[i] / 2);
    }
}