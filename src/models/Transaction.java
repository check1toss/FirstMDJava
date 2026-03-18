package models;

import java.time.LocalDateTime;

public class Transaction {
	
	static int autoincrement = 0;
	private String id;
	private LocalDateTime Time;
	private double amount;
	private String description;
	private BankAccount sourceAccount;
	private BankAccount targetAccount;
	
}
