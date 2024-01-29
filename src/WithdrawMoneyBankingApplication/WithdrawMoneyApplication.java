package src.WithdrawMoneyBankingApplication;

public class WithdrawMoneyApplication {
    long totalAmount = 10000;
    synchronized void withdrawMoney(long transId, int amount ){
            if(totalAmount >= amount){
                System.out.println(amount + " debit from your account, Transaction Id : " +transId);
                long amountLeft = totalAmount - amount;
                totalAmount = amountLeft;
                System.out.println("Amount left : " +totalAmount);
            }
            else {
                System.out.println("Insufficient Balance!! Please try again Later, Transaction Id : " +transId);
            }
    }
}
