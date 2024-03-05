
public class BankAccount {
	private double checkingBalance;
	private double savingsBalance;
	private static int accounts;
	private static double totalMoney;
	
	public BankAccount() {
		BankAccount.accounts++;
	}

	public double getCheckingBalance() {
		return checkingBalance;
	}

	public void setCheckingBalance(double checkingBalance) {
		this.checkingBalance = checkingBalance;
	}

	public double getSavingsBalance() {
		return savingsBalance;
	}

	public void setSavingsBalance(double savingsBalance) {
		this.savingsBalance = savingsBalance;
	}

	public static int getAccounts() {
		return accounts;
	}

	public static void setAccounts(int accounts) {
		BankAccount.accounts = accounts;
	}

	public static double getTotalMoney() {
		return totalMoney;
	}

	public static void setTotalMoney(double totalMoney) {
		BankAccount.totalMoney = totalMoney;
	}
	
	public void checkingDeposit(double amount) {
		  this.checkingBalance += amount;
		  System.out.println(String.format("You now have %.2f ", this.checkingBalance));
		  BankAccount.totalMoney += amount;
		  System.out.println(String.format("Total Money is now %.2f ", BankAccount.totalMoney));
		 
	}
	
	public void checkingWithdrawl(double amount) {
		if (this.checkingBalance >= amount) {
			this.checkingBalance -= amount;
			System.out.println(String.format("You now have %.2f", this.checkingBalance));
			BankAccount.totalMoney -= amount;
			System.out.println(String.format("Total money is now %.2f", BankAccount.totalMoney));
		}
		else {
			System.out.println("Inufficient Funds");
		}
	}
	
	public void savingsDeposit(double amount) {
		this.savingsBalance += amount;
		System.out.println(String.format("You now have %.2f", this.savingsBalance));
		BankAccount.totalMoney += amount;
		System.out.println(String.format("Total money is now %.2f", BankAccount.totalMoney));
	}
	
	public void savingsWithdrawl(double amount) {
		if (this.savingsBalance >= amount) {
			this.savingsBalance -= amount;
			System.out.println(String.format("You now have %.2f", this.savingsBalance));
			BankAccount.totalMoney -= amount;
			System.out.println(String.format("Total money is now %.2f", BankAccount.totalMoney));
		}
		else {
			System.out.println("Insufficient Funds");
		}
	}
	
	public void getTotalAmount() {
		System.out.println(String.format("Your total amount from both accounts is %.2f", this.checkingBalance + this.savingsBalance));
	}
	
	public void getTotallyNotSecretBankInfo() {
		System.out.println(String.format("The Bank has %d accounts", BankAccount.accounts));
		System.out.println(String.format("The Bank has a total amount of %.2f", BankAccount.totalMoney));
	}
}
