package Task25;

public class CreditCard extends BankCard {

	public CreditCard(String name, int balance, int pin, int pinCounter, boolean isBlocked, int limit) {
		super(name, balance, pin, pinCounter, isBlocked);
		this.limit = limit;
	}

	private int limit;

	public int getLimit() {
		return limit;
	}

	public void setLimit(int limit) {
		this.limit = limit;
	}

	public boolean makeAPaiment(int purchaseAmount, int pin) {
		if (pinCheck(pin)) {
			if (purchaseAmount <= getLimit()) {
				setLimit(getLimit() - purchaseAmount);
				return true;
			}
			return false;
		}
		return false;
	}
}
