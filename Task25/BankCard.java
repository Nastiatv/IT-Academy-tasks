package Task25;

public abstract class BankCard {
	private String name;
	private int balance;
	private int pin;
	private int pinCounter;
	private boolean isBlocked;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public int getPinCounter() {
		return pinCounter;
	}

	public void setPinCounter(int pinCounter) {
		this.pinCounter = pinCounter;
	}

	public BankCard(String name, int balance, int pin, int pinCounter, boolean isBlocked) {
		this.name = name;
		this.balance = balance;
		this.pin = pin;
		this.pinCounter = pinCounter;
		this.isBlocked = isBlocked;
	}

	public abstract boolean makeAPaiment(int purchaseAmount, int pin);

	public boolean pinCheck(int pin) {
		if (isBlocked == true) {
			return false;
		}
		
		if (pinCounter>=1)
			{
			if (pin == getPin()) {
				pinCounter = 3;
				return true;
			}
			if (pin != getPin()) {
				if(pinCounter==1) {isBlocked = true;}
				pinCounter--;
			}}
		
					
		return false;
	}
}




