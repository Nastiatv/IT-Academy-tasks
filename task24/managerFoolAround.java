package Task24;

public class ManagerFoolAround {

	public static void main(String[] args) {
		

				Technics[] technics=new Technics[2];
				technics[0]=new Fridge("Bosch", 500);
				technics[1]=new Fridge("Atlant", 400);
				
						
						
						 for(Technics i: technics) {
					            System.out.println(i.isStatusPower() );

					        }

					        System.out.println();
					        technics[1].setStatusPower(true);


					        for(Technics i: technics) {
					            System.out.println(i.isStatusPower() );

					        }
		    }}