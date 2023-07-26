import java.util.Scanner;
class practice6_18{
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        System.out.print("行数：");
        int row = stdIn.nextInt();

        int [][] c = new int[row][];
        int column;

        for(int i = 0; i < row; i++){
            System.out.print("第" + (i + 1) + "行的列数为：");
            column = stdIn.nextInt();
            c[i] = new int[column];
            for(int j = 0; j < column; j++){
                System.out.print("c[" + i + "][" + j + "] = ");
                c[i][j] = stdIn.nextInt();
            }
        }

        for(int i = 0; i < row; i++){
            for(int j = 0; j < c[i].length; j++)
                System.out.printf("%4d", c[i][j]);
            System.out.println();
        }
    }
}