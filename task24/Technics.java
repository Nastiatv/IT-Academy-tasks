package itAcademytasks;

class hierarchy{}
	class Technics {
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
		
			class kitchenAppliances extends Technics {
				boolean isOn=false;
			}
				class fridge extends kitchenAppliances{
					String name;
					fridge(String name){
						this.name=name;
					}
				}
			class phonesAndTablets extends Technics {}
				class phone extends phonesAndTablets{
				String name;
				phone(String name){
					this.name=name;
				}
				}
			class laptopsAndComputers extends Technics {}
				class laptop extends laptopsAndComputers{
				String name;
				laptop(String name){
					this.name=name;
				}
				}
			
	
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