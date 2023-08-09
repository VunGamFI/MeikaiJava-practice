class practice15_6{
    public static void main(String[] args){
        for(int i = 0; i < args.length; i++){
            System.out.println("该圆的周长为" + Double.parseDouble(args[i]) * Math.PI * 2);
            System.out.println("该圆的面积为" + Double.parseDouble(args[i]) * Double.parseDouble(args[i]) * Math.PI);
        }
    }
}