import java.util.Scanner;
class practice6_16{
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        int[][] a = new int[4][3];
        int[][] b = new int[3][4];
        int[][] c = new int[4][4];

        System.out.println("矩阵a");
        for(int i = 0; i < 4; i++)
            for(int j = 0; j < 3; j++){
                System.out.print("a[" + i + "][" + j + "] = ");
                a[i][j] = stdIn.nextInt();
            }

        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 3; j++)
                System.out.printf("%3d", a[i][j]);
            System.out.println();
        }

        System.out.println("矩阵b");
        for(int i = 0; i < 3; i++)
            for(int j = 0; j < 4; j++){
                System.out.print("b[" + i + "][" + j + "] = ");
                b[i][j] = stdIn.nextInt();
            }

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 4; j++)
                System.out.printf("%3d", b[i][j]);
            System.out.println();
        }

        for(int i = 0; i < 4; i++)
            for(int j = 0; j < 4; j++)
                for(int k = 0; k < 3; k++){
                    c[i][j] += a[i][k] * b[k][j];
                }

        System.out.println("矩阵c");
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++)
                System.out.printf("%3d", c[i][j]);
            System.out.println();
        }
    }
}