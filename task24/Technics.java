package itAcademytasks;

public class Technics {
		boolean isOn=false;
		
		public void on() {
			isOn=false;
		}

		
		public void off() {
			isOn=false;
		}

		
		public boolean getState() {
			return isOn;
		}}
		
			
						
				
			
			
	
	class managerFoolAround extends Technics{		
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