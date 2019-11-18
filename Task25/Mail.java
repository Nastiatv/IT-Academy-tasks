package Task25;

public class Mail {

	public static void main(String[] args) {
		
		
	
		
		DebitCard card=new DebitCard("first", 999, 258, 3, false);
		/*Maestro card1=new Maestro("second", 999, 258, 3, false);
		CreditCard card2=new CreditCard("third", 0, 258, 3, false, 1000);
		Visa card3=new Visa("fourth", 999, 258, 3, false);
		VisaElectron card4=new VisaElectron("fifth", 999, 258, 3, false);
		Mastercard card5=new Mastercard("sixth", 999, 258, 3, false);
		Maestro card6=new Maestro("seventh", 999, 258, 3, false);*/
		
		System.out.println(card.getPinCounter());
		card.pinCheck(245);
		card.pinCheck(245);
		card.pinCheck(258);
		System.out.println(card.getPinCounter());
		card.makeAPaiment(100,148);
		System.out.println(card.getBalance());
	}

}
