package constructor;

public class Account {

	private String holder;
	private int accountNumb;
	private double balance;

	public Account(String holder, int accountNumb) {

		this.holder = holder;
		this.accountNumb = accountNumb;

	}

	public Account(String holder, int accountNumb, double deposit) {

		this.holder = holder;
		this.accountNumb = accountNumb;
		deposit(deposit);

	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public int getAccountNumb() {
		return accountNumb;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double deposit) {
		this.balance += deposit;
	}
	
	public void withdraw(double withdraw) {
		this.balance -= withdraw + 5;
	}
	
	public String toString() {
		
		return "Account " + accountNumb + ", Holder: " + holder + ", Balance: $ " + String.format("%.2f", balance);
	}
	

}
