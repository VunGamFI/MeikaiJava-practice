class practice15_8{
    public static void main(String[] args){
        if(args.length == 1)
            for(int j = 1; j <= 12; j++)
                System.out.println(j + "月的日历");
        else if(args.length == 2){
            System.out.println(args[1] + "月的日历");
        }else if(args.length == 0)
            System.out.println("当前月份的日历");
    }
}