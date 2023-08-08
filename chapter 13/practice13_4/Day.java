package practice13_4;
public class Day {
    private int year = 1;
    private int month = 1;
    private int date = 1;

    //--- 构造函数 ---//
    public Day() { }
    public Day(int year) { this.year = year; }
    public Day(int year, int month) { this(year); this.month = month; }
    public Day(int year, int month, int date) { this(year, month); this.date = date;}
    public Day(Day d) { this(d.year, d.month, d.date); }

    //--- 计算星期 ---//
    public int dayOfWeek(){
        int y = year;
        int m = month;
        if(m == 1 || m == 2){
            y--;
            m += 12;
        }
        return (y + y / 4 - y / 100 + y / 400 + (13 * m + 8) / 5 + date) % 7;
    }

    //--- 返回字符串表示 ---//
    public String toString(){
        String[] wd = {"日", "一", "二", "三", "四", "五", "六"};
        return String.format("%04d年%02d月%02d日（%s）",
                                year, month, date, wd[dayOfWeek()]);
    }
}
