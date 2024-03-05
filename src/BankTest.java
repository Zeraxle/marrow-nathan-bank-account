

public class BankTest {
	public static void main(String[] args) {
		
		
		BankAccount markAccount =  new BankAccount();
		BankAccount timAccount = new BankAccount();
		BankAccount janeAccount = new BankAccount();
		
		markAccount.checkingDeposit(50);
		timAccount.checkingDeposit(100); 
		janeAccount.checkingDeposit(150.75);
		
		markAccount.checkingWithdrawl(30);
		timAccount.checkingWithdrawl(101);
		
		janeAccount.savingsDeposit(100);
		janeAccount.savingsWithdrawl(50);
		janeAccount.savingsWithdrawl(55);
		
		janeAccount.getTotalAmount();
		
		markAccount.getTotallyNotSecretBankInfo();
		
		 
		 
	}
}
