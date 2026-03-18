package models;

public class BankAccount {
	static int autoIncrement = 0;
	private long ID_BankAccount;
	private String iban;
	private double balance;
	private boolean active;
	
		
	public BankAccount() {
		autoIncrement++;
		ID_BankAccount = autoIncrement;
		iban = "xxxxxxxxxxxxx";
		balance = 0;
		active = false;
		
	}
	
	public BankAccount(String iban, double balance, boolean active) {
		autoIncrement++;
		ID_BankAccount = autoIncrement;
		this.iban = iban;
		this.balance = balance;
		this.active = active;
		
		
	}

	public long getID_BankAccount() {
		return ID_BankAccount;
	}

	public void setID_BankAccount(long iD_BankAccount) {
		ID_BankAccount = iD_BankAccount;
	}

	public String getIban() {
		return iban;
	}

	public void setIban(String iban) {
		this.iban = iban;
	}

	public double getBalance() {
		return balance;
	}

	@Override
	public String toString() {
		return "BankAccount [ID_BankAccount=" + ID_BankAccount + ", iban=" + iban + ", balance=" + balance + ", active="
				+ active + "]";
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

}
