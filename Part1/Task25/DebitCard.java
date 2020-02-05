package Task25;

public class DebitCard extends BankCard {

	public DebitCard(String name, int balance, int pin, int pinCounter, boolean isBlocked) {
		super(name, balance, pin, pinCounter, isBlocked);
	}

	
	public boolean makeAPaiment(int purchaseAmount, int pin) {
		if (pinCheck(pin)) {
			if (getBalance() >= purchaseAmount) {
				setBalance(getBalance() - purchaseAmount);
				return true;
			}
		}
		return false;
	}

}
