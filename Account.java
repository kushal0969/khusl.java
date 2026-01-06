package Assignment2;
public class Account {
    int balance;

    Account() {
        balance = 1000;
    }

    public static void main(String[] args) {
        Account acc = new Account();
        System.out.println("Balance: " + acc.balance);
    }
}
