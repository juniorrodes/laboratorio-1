package test;
import bank.Account;

public class TestAccount {

    private static Account account;

    public static void main(String[] args) {
        account = new Account("Luis");

        double withdrawValue = 125.00f;

        account.deposit(100.00f);
        TestWithdraw(withdrawValue);
        System.out.println();

        account.deposit(30.00f);
        TestWithdraw(withdrawValue);
        System.out.println();

        withdrawValue = 10.00f;
        TestWithdraw(withdrawValue);
        System.out.println();

        withdrawValue = 5.00f;
        TestWithdraw(withdrawValue);
        System.out.println();

    }

    private static void TestWithdraw(double value) {
        if (!account.withdraw(value)) {
            System.out.println("Não foi possível retirar este valor da conta. \nSeu saldo é de: "
                    + account.getBalance() + " mas você tentou sacar: " + value);
        } else {
            System.out.println("O saque foi realizado com sucesso. \nSeu saldo atual é de: "
                    + account.getBalance());
        }
    }
}
