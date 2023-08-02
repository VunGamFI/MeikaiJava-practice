package practice9_3;
public class Account{
    private String name;
    private String no;
    private long balance;
    private Day dateOpen;
    public Account(String name, String no, long balance, Day dateOpen){
        this.name = name;   this.no = no;   this.balance = balance;
        this.dateOpen = new Day(dateOpen);
    }
    public String getName() { return name; }
    public String getNo() { return no; }
    public long getBalance() { return balance; }
    public Day getDateOpen(){
        return new Day(dateOpen);
    }
    public void deposit(long k){
        balance += k;
    }
    public void withdraw(long k){
        balance -= k;
    }
}