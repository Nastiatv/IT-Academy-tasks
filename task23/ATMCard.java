package Task23;


public class ATMCard {
	
	public static void main(String[] args) {
		
		 ATMCard myCard =new ATMCard(5,4,1);
		System.out.println(myCard.getBalance());
		myCard.replenishCard(5,0,1);
		 System.out.println(myCard.getBalance());		
		myCard.cashWithdrawal(130);
		System.out.println(myCard.getBalance());
			}

			
			private int quantity20;
			private int quantity50;
			private int quantity100;
			
			public int getQuantity20() {
				return quantity20;
			}

			public void setQuantity20(int quantity20) {
				this.quantity20 = quantity20;
			}

			public int getQuantity50() {
				return quantity50;
			}

			public void setQuantity50(int quantity50) {
				this.quantity50 = quantity50;
			}

			public int getQuantity100() {
				return quantity100;
			}

			public void setQuantity100(int quantity100) {
				this.quantity100 = quantity100;
			}



			
		public ATMCard(int twenty,int fifty, int oneHundred) {
			this.quantity20=twenty;
			this.quantity50=fifty;
			this.quantity100=oneHundred;
			}

		private void replenishCard(int twenty,int fifty, int oneHundred) {
			this.quantity20=this.quantity20+twenty;
			this.quantity50=this.quantity50+fifty;
			this.quantity100=this.quantity100+oneHundred;
			System.out.println("Replenishment was successful");
			}

		private int getBalance() {
			int balanceBYN=this.quantity50*50+this.quantity20*20+this.quantity100*100;
			return balanceBYN;
			}
			
		private boolean cashWithdrawal(int sumOfWithdraw) {
			
			int counter20=0;
			int counter50=0;
			int counter100=0;
			int balance=this.quantity100*100+this.quantity50*50+this.quantity20*20;	
			
			if(sumOfWithdraw>=20&&sumOfWithdraw!=30&& sumOfWithdraw<=(balance-20)&& balance>0) {
				
		while(sumOfWithdraw!=0) {
				do {
				counter20++;
				sumOfWithdraw-=20;}
				while(sumOfWithdraw%50!=0);
		         			
			while(sumOfWithdraw>=100&&this.quantity100-counter100>0) {
				counter100++;
				sumOfWithdraw-=100;
			}
		
			while(sumOfWithdraw>=50&&this.quantity50-counter50>0) {
					counter50++;
					sumOfWithdraw-=50;
					}
			if ((this.quantity20 - counter20)<0) {
                System.out.println("error");
                return false;
			}}}		
			
			if(sumOfWithdraw==0) {
				this.quantity100-=counter100;
				this.quantity50-=counter50;
				this.quantity20-=counter20;
			System.out.println("Take 100:"+ counter100 + "; 50:" + counter50 + "; 20:" + counter20 + ";");
			return true;
			} else {
				System.out.println ("error");
				return false;}
			}
		}
			
			
	
			