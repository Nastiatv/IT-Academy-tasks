package task24;

public class managerFoolAround extends Technics{		
	public void main(String[] args) {

		fridge fridgeBosch= new fridge("Bosch");
		phone phoneSamsung = new phone("Samsung");
		phoneSamsung.on();
		laptop laptopLenovo =new laptop("Lenovo");
		laptopLenovo.off();
		
System.out.println(fridgeBosch.getState());
System.out.println(phoneSamsung.getState());
System.out.println(laptopLenovo.getState());
    }}