package models;

public class Client extends Person{
	
	private String email;
	private Adress adress;
	private BankAccount accounts;
	private String client_code;
	
	
	public Client() {
		super();
		email = "empty";
		adress = new Adress();
		accounts = new BankAccount();
		client_code = "empty";
	}
	
	public Client(String name, String surname, String personcode, String email, Adress adress, BankAccount accounts, String client_code) {
		
		super(name, surname, personcode);
		this.email = email;
		this.adress = adress;
		this.accounts = accounts;
		this.client_code = client_code;
		
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Adress getAdress() {
		return adress;
	}

	public void setAdress(Adress adress) {
		this.adress = adress;
	}

	public BankAccount getAccounts() {
		return accounts;
	}

	public void setAccounts(BankAccount accounts) {
		this.accounts = accounts;
	}

	public String getClient_code() {
		return client_code;
	}

	public void setClient_code(String client_code) {
		this.client_code = getName().substring(0,1) + "_" +  getSurname().substring(0,1) + "_" + client_code;
	}

	
	
}
