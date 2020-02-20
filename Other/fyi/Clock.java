package fyi;

public class Clock extends Thread {

	   public static void main(String[] args) throws InterruptedException {
	       Clock clock = new Clock();
	       clock.start();

	       Thread.sleep(10000);
	       clock.interrupt();
	   }

	   @Override
	   public void run() {
	       Thread current = Thread.currentThread();

	       while (!current.isInterrupted())
	       {
	           try {
	               Thread.sleep(1000);
	           } catch (InterruptedException e) {
	               System.out.println("Работа потока была прервана");
	               break;
	           }
	       System.out.println("Tik");
	       }
	   }
	}