package models;

import java.time.LocalDate;
import java.util.Date;

public class Card {
	
	private String cardNumber;
	private LocalDate expiryDate;
	private int cvv;
	private boolean active;
	private BankAccount account;
	
	public Card() {
		
		cardNumber = "1234567890";
		expiryDate = LocalDate.now();
		cvv = 123;
		active = false;
		account = new BankAccount();
	}
	
	
	public Card(String CardNumber, LocalDate expiryDate, int cvv, boolean active, BankAccount account) {
		
		this.cardNumber = cardNumber;
		this.expiryDate = expiryDate;
		this.cvv = cvv;
		this.active = active;
		this.account = account;
		
	}


	public String getCardNumber() {
		return cardNumber;
	}


	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}


	public LocalDate getExpiryDate() {
		return expiryDate;
	}


	public void setExpiryDate(LocalDate expiryDate) {
		this.expiryDate = expiryDate;
	}


	public int getCvv() {
		return cvv;
	}


	public void setCvv(int cvv) {
		this.cvv = cvv;
	}


	public boolean isActive() {
		return active;
	}


	public void setActive(boolean active) {
		this.active = active;
	}


	public BankAccount getAccount() {
		return account;
	}


	public void setAccount(BankAccount account) {
		this.account = account;
	}


	@Override
	public String toString() {
		return "Card [cardNumber=" + cardNumber + ", expiryDate=" + expiryDate + ", cvv=" + cvv + ", active=" + active
				+ ", account=" + account + "]";
	}
	
	
	

}
