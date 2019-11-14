package task24;

public class Fridge extends KitchenAppliances{
	
	boolean isOn;
	public Fridge(String name, boolean isOn){
		this.isOn=isOn;}
<<<<<<< HEAD:task24/fridge.java
}
	
=======
	
	
	@Override
	public void on() {
			isOn=true;
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
>>>>>>> a3a15ea14efa54d68f31b305b748fbe211f4d09f:task24/Fridge.java
