package practice9_5;
public class Period{
    private Day from = new Day(1, 1, 1);
    private Day to = new Day(1, 1, 1);

    //构造函数
    public Period(){}
    public Period(Day from){
        this.from = new Day(from);
    }
    public Period(Day from, Day to){
        this(from);
        this.to = new Day(to);
    }
    public Period(Period time){
        this(time.from, time.to);
    }

    public Period getFrom(){
        return new Period(from);
    }
    public Period getTo(){
        return new Period(to);
    }

        //--- 返回字符串表示 ---//
    public String toString(){
        return String.format("%04d年%02d月%02d日到%04d年%02d月%02d日",
                            from.getYear(), from.getMonth(), from.getDate(),
                            to.getYear(), to.getMonth(), to.getDate()
                            );
    }
}