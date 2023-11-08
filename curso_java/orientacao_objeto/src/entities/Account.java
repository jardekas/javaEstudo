package entities;

public class Account {

	private int num;
	private double balance;
	private String holder;
	
	public Account(String holder) {
		this.holder = holder;
	}
	
	public Account(int num, double balance) {
		this.num = num;
		this.balance = balance;
	}
	
	public Account(int num, double balance, String holder) {
		this.num = num;
		this.balance = balance;
		this.holder = holder;
	}
	
	
	public int getNum() {
		return num;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getHolder() {
		return holder;
	}
	public void setHolder(String holder) {
		this.holder = holder;
	}
	
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) {
		balance -= amount + 5;
	}
	
	public String toString(){
		return "Account "
	+ num 
	+ ", Holder: "
	+ holder
	+", Balance: $ "
	+ String.format("%.2f", getBalance());
	}
	
	
}
