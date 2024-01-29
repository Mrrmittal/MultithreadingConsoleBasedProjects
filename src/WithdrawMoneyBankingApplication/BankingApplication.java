package src.WithdrawMoneyBankingApplication;

public class BankingApplication implements Runnable {

    long transId;
    int amount;
    static WithdrawMoneyApplication obj;

    public BankingApplication(long transId, int amount) {
        this.transId = transId;
        this.amount = amount;
    }

    @Override
    public void run() {
            obj.withdrawMoney(transId, amount);
    }

    public static void main(String[] args) {
        obj = new WithdrawMoneyApplication();
        BankingApplication bankingApplication = new BankingApplication(181191000,1000);
        BankingApplication bankingApplication2 = new BankingApplication(1811910001, 2000);
        Thread thread = new Thread(bankingApplication);
        Thread thread1 = new Thread(bankingApplication2);

        thread1.start();
        thread.start();

    }

}
