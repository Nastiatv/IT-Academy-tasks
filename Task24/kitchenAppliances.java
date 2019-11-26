package Task24;

public class kitchenAppliances extends Technics {

	
	public kitchenAppliances(String name, int value) {
	      super(name, value);}
	
	
	
	@Override
    public boolean isStatusPower() {
        return  statusPower;
    }


	
}

