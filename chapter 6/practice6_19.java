import java.util.Scanner;
class practice6_19{
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        System.out.print("班级数：");
        int ClassNum = stdIn.nextInt();

        int[][] StudentNum = new int[ClassNum][];
        int[] sum = new int[ClassNum];
        double[] average = new double[ClassNum];
        int TotalSum = 0;
        double TotalAverage = 0;
        int TotalStudent = 0;
        int num;

        for(int i = 0; i < ClassNum; i++){
            System.out.print((i + 1) + "班人数：");
            num = stdIn.nextInt();
            StudentNum[i] = new int[num];
            for(int j = 0; j < num; j++){
                System.out.print((i + 1) + "班" + (j + 1) + "号的分数：");
                StudentNum[i][j] = stdIn.nextInt();
            }
        }

        for(int i = 0; i < ClassNum; i++)
            for(int j = 0; j < StudentNum[i].length; j++)
                sum[i] += StudentNum[i][j];
        for(int i = 0; i < ClassNum; i++)
            average[i] = (double)sum[i] / StudentNum[i].length;
        for(int i = 0; i < ClassNum; i++)
            TotalSum += sum[i];
        for(int i = 0; i < ClassNum; i++)
            TotalStudent += StudentNum[i].length;
        for(int i = 0; i < ClassNum; i++)
            TotalAverage = (double)TotalSum / TotalStudent;

        System.out.println("  班  |    总分  平均分  ");
        System.out.println("------+-----------------");

        for(int i = 0; i < ClassNum; i++){
            System.out.print(" " + (i + 1) + "班  |");
            System.out.printf("%7d", sum[i]);
            System.out.printf("%7.1f", average[i]);
            System.out.println();
        }

        System.out.println("------+-----------------");
        System.out.print(" 合计  |");
        System.out.printf("%6d", TotalSum);
        System.out.printf("%7.1f", TotalAverage);
        System.out.println();
    }
}