package task24;

public abstract class Technics {
	protected boolean statusPower;
	protected String name;
	private int value;
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getValue() {
		return value;
	}


	public void setValue(int value) {
		this.value = value;
	}


	public void setStatusPower(boolean statusPower) {
		this.statusPower = statusPower;
	}

	
		
public Technics(String name, int value) {
       this.name=name;
       this.value=value;
       this.statusPower = false;
}
	
public abstract boolean isStatusPower();
}
				
			
				
					
					
				
		