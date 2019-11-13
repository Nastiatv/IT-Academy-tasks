package task22;

public class periodOfTime {
	private int sec;
	private int min;
	private int hours;
	
	public periodOfTime(int sec,int min, int hours) { 
		this.sec=sec;
		this.min=min;
		this.hours=hours;
		}
	
	public periodOfTime(int sec){
			this.sec=sec%60;
		if(sec/60>=60) {
			this.min=(sec/60)%60;
			this.hours=sec/60/60;}
		else {this.min=sec/60;
			this.hours=0;
			}
		}
	
	private int countSec()	{
		int hoursInSec=hours*60*60;
		int minInSec=min*60;
		int periodInSec=hoursInSec+minInSec+sec;		
		return periodInSec;
	}
	
	private void printTime()
	{
		if(min>59) {
			hours=hours+min/60;
			min=min%60+sec/60;
			}
		if(sec>59) {
			min=min+sec/60;
			sec=sec%60;
		}
			System.out.println(sec+" seconds "+min+" minutes "+hours+" hours ");
	}
	
	private static int compareTwo(periodOfTime x, periodOfTime y) {
		String A="object=" + x.countSec();
		String B="object=" + y.countSec();
		return	A.compareTo(B);
		
	}
	
		public static void main(String[] args) {
		
			periodOfTime day = new periodOfTime(3666);
			periodOfTime night =new periodOfTime(6,1,1);
	
		day.printTime();
		night.printTime();
		
		System.out.println(day.countSec());
		System.out.println(night.countSec());
		
		System.out.println(compareTwo(day, night));
			}}
