public class Husband implements Runnable {

    private final BankAccount husbandAccount;

    public Husband(BankAccount husbandAccount) {
        this.husbandAccount = husbandAccount;
    }

    @Override
    public void run() {
        husbandAccount.withdraw(1000);
        husbandAccount.withdraw(1500);
        husbandAccount.withdraw(2400);
        husbandAccount.deposit(5000);
        husbandAccount.deposit(1000);
//        System.out.println(Thread.currentThread().getName() + " " + husbandAccount.getBalance());
    }
}
