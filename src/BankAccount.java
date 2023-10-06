public class BankAccount {
    private int accountNumber;
    private double balance;

    public BankAccount() {
    }

    public BankAccount(int accountNumber, int balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public synchronized void deposit(double amount) {
        balance = balance + amount;
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread().getName() + " " + getBalance());
    }

    public synchronized void withdraw(double amount) {
        if (balance >= amount){
            balance = balance - amount;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName() + " " + getBalance());
        } else {
            System.out.println("Insufficient Funds!");
        }
    }

    public synchronized double getBalance(){
        return balance;
    }
}
