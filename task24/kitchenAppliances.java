package task24;

public class KitchenAppliances extends Technics {

	
	public KitchenAppliances(String name, int value) {
	      super(name, value);}
	
	
	
	@Override
    public boolean isStatusPower() {
        return  statusPower;
    }


	
}

