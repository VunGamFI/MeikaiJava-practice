class practice7_28{
    static int[][] addMatrix(int[][] x, int[][] y){
        int[][] add = new int[x.length][];
        for(int i = 0; i < x.length; i++)
            add[i] = new int[x[i].length];

        for(int i = 0; i < x.length; i++)
            for(int j = 0; j < x[i].length; j++)
                add[i][j] = x[i][j] + y[i][j];
        return add;
    }
    static void printMatrix(int[][] m){
        for(int i = 0; i < m.length; i++){
            for(int j = 0; j < m[i].length; j++)
                System.out.print(m[i][j] + " ");
            System.out.println();
        }
    }

    public static void main(String[] args){
        int[][] a = {{1, 2, 3, 4}, {4, 3}, {5, 9, 8, 7, 6}};
        int[][] b = {{2, 4, 5, 7}, {9, 2}, {1, 3, 6, 5, 2}};
        int[][] c = addMatrix(a, b);
        System.out.println("矩阵a");
        printMatrix(a);
        System.out.println("矩阵b");
        printMatrix(b);
        System.out.println("矩阵c");
        printMatrix(c);
    }
}