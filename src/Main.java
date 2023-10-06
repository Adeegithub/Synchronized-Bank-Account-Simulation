public class Main {
    public static void main(String[] args) {
        BankAccount jointAccount = new BankAccount(12345,100000);
        Husband husbandAccount = new Husband(jointAccount);
        Wife wifeAccount = new Wife(jointAccount);

        Thread husbandThread = new Thread(husbandAccount,"Husband Thread");
        Thread wifeThread = new Thread(wifeAccount, "Wife Thread");

        husbandThread.start();
        wifeThread.start();

        try {
            wifeThread.join();
            husbandThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("The Final Bank Account Balance is " + jointAccount.getBalance());
    }
}