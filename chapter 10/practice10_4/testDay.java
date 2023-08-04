package practice10_4;

class testDay{
    public static void main(String[] args){
        Day today = new Day();
        Day day_1 = new Day(2010);
        Day day_2 = new Day(2013, 1);
        Day day_3 = new Day(2019, 2, 30);
        Day day_4 = new Day(day_3);

        System.out.println(today);
        System.out.println(day_1);
        System.out.println(day_2);
        System.out.println(day_3);

        System.out.println("今年过去的天数为" + Day.pastTime(today) + "天。");
        System.out.println("今年剩余天数为" + Day.futureTime(today) + "天。");

        Day.isLike(today, day_3);
        Day.isLike(day_3, day_4);

        int n = 10;
        today.back(today, n);
        today.future(today, n);
        day_2.isLike();
    }
}