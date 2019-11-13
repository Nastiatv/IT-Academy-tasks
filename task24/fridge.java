package task24;

public class Fridge implements KitchenAppliances{
	
	private String name;
	boolean isOn;
	public Fridge(String name, boolean isOn){
		this.name=name;
		this.isOn=isOn;}
	
	
	@Override
	public void on() {
			isOn=false;
		}
	@Override
	public void off() {
			isOn=false;
		}

	@Override
	public boolean getState() {
			return isOn;
		}
}