package task24;

public abstract class KitchenAppliances implements Technics {
	
	boolean isOn;
	public void on() {
		isOn=true;
	}
	public void off() {
		isOn=false;
	}
	public boolean getState() {
		return isOn;
	}
}