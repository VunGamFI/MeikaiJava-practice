package practice10_5;
class AccountTester{
    public static void main(String[] args){
        Account adachi = new Account("足立幸一", "123456", 1000);
        System.out.println("足立的账户");
        System.out.println("账户名：" + adachi.getName());
        System.out.println("帐号：" + adachi.getNo());
        System.out.println("可用余额：" + adachi.getBalance());
        System.out.println("标识编号：" + adachi.getId());
        Account nakata = new Account("仲田真二", "654321", 200);
        System.out.println("足立的账户");
        System.out.println("账户名：" + nakata.getName());
        System.out.println("帐号：" + nakata.getNo());
        System.out.println("可用余额：" + nakata.getBalance());
        System.out.println("标识编号：" + nakata.getId());
    }
}