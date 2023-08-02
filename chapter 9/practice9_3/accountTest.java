package practice9_3;
class accountTest{
    static void output(Account account){
        System.out.println("账户名：" + account.getName());
        System.out.println("帐号：" + account.getNo());
        System.out.println("余额：" + account.getBalance());
        System.out.println("开户时间：" + account.getDateOpen());
    }

    public static void main(String[] args){
        Account adachi = new Account("足立幸一", "123456", 900, new Day(1995, 1, 15));
        Account nakata = new Account("仲田真二", "654321", 800, new Day(2000, 9, 10));

        adachi.deposit(400);
        nakata.withdraw(20);

        System.out.println(adachi.getName() + "的账户信息");
        output(adachi);
        System.out.println(nakata.getName() + "的账户信息");
        output(nakata);
    }
}