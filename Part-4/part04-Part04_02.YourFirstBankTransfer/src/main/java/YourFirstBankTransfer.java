
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // write your program here
        Account MathewsAccount = new Account("Matthews account", 1000.00);
        Account MyAccount = new Account("My account", 0.00);
        MathewsAccount.withdrawal(100.00);
        MyAccount.deposit(100.00);
        System.out.println(MathewsAccount);
        System.out.println(MyAccount);
    }
}
