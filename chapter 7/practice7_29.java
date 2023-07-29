class practice7_29{
    static int[][] aryClone2(int[][] a){
        int[][] clone = new int[a.length][];
        for(int i = 0; i < a.length; i++)
            clone[i] = new int[a[i].length];
        for(int i = 0; i < a.length; i++)
            for(int j = 0; j < a[i].length; j++)
                clone[i][j] = a[i][j];
        return clone;
    }
    static void printMatrix(int[][] m){
        for(int i = 0; i < m.length; i++){
            for(int j = 0; j < m[i].length; j++)
                System.out.print(m[i][j] + " ");
            System.out.println();
        }
    }

    public static void main(String[] args){
        int[][] a = {{1, 2, 4, 6, 5}, {7, 2, 4}, {9, 8, 3, 6}};
        int[][] clone = aryClone2(a);
        System.out.println("矩阵a");
        printMatrix(a);
        System.out.println("克隆后的矩阵");
        printMatrix(clone);
    }
}