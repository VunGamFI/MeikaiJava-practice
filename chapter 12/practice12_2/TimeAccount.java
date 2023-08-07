package practice12_2;

class TimeAccount extends Account{
    private long timeBalance;   //可用余额（定期存款）

    TimeAccount(String name, String no, long balance, long timeBalance){
        super(name, no, balance);
        this.timeBalance = timeBalance;
    }

    public long getTimeBalance(){
        return timeBalance;
    }
    void cancel(){
        deposit(timeBalance);
        timeBalance = 0;
    }

    static int compBalance(Account a, Account b){
        if(a instanceof TimeAccount && b instanceof TimeAccount){
            ((TimeAccount)a).cancel();
            ((TimeAccount)b).cancel();
        }

        if(a.getBalance() > b.getBalance())
            return 1;
        else if(a.getBalance() == b.getBalance())
            return 0;
        else
            return -1;
    }
}