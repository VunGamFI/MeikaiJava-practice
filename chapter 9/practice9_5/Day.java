package practice9_5;
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

    // --- 获取年、月、日 ---//
    public int getYear() { return year; }
    public int getMonth() { return month; }
    public int getDate() { return date; }

}
