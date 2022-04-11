package bank;
import java.util.UUID;

public class Account {

    private double balance;
    private String name;
    private String accountNumber;

    public Account(String name) {
        this.name = name;
        this.balance = 0;
//        UUID id = UUID.randomUUID();
        this.accountNumber = UUID.randomUUID().toString();
    }

    public void deposit(double value) {
        this.balance += value;
    }

    public double getBalance() {
        return balance;
    }

    public boolean withdraw(double value) {
        if (this.balance < value) {
            return false;
        }
        this.balance -= value;
        return true;
    }

    @Override
    public String toString() {
        return "Account{\n" +
                "\tbalance = " + balance + ",\n" +
                "\tname = " + name + ",\n" +
                "\taccountNumber = " + accountNumber + '\n' +
                '}';
    }
}
