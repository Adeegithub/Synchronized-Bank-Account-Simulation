public class Wife implements Runnable {

    private final BankAccount wifeAccount;

    public Wife(BankAccount wifeAccount) {
        this.wifeAccount = wifeAccount;
    }

    @Override
    public void run() {
        wifeAccount.deposit(1000);
        wifeAccount.withdraw(50000);
        wifeAccount.deposit(3800);
        wifeAccount.deposit(2500);
        wifeAccount.withdraw(6800);
    }
}
