class practice7_33{
    static void printArray(int[] a){
        for(int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
        System.out.println();
    }
    static void printArray(int[][] a){
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++)
                System.out.printf("%-6d", a[i][j]);
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args){
        int[] a = {12, 536, -8, 7};
        int[][] b = {
                {32, -1, 32, 45, 67},
                {535, 99999, 2},
                {2, 5, -123, 9},
        };
        System.out.println("一维数组");
        printArray(a);
        System.out.println("二维数组");
        printArray(b);
    }
}