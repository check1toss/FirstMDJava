package models;

import java.time.LocalDateTime;

import model.enums.AutomaticPaymentSchedule;

public class AutomaticPayment extends Transaction {

	private String title;
	private AutomaticPaymentSchedule scheduleType;
	private LocalDateTime nextPaymentDate;
	private boolean active;
	
}
