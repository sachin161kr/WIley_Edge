package JavaThreads;

import java.util.concurrent.*;

class WeddingCardWrap extends Thread
{
	public void run()
	{
		System.out.println("Thread Name : "+Thread.currentThread().getName());
	}
}

public class RishavWeddingCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Fixed Size Thread 
		//ExecutorService exe = Executors.newFixedThreadPool(4);
		
		

//		for(int i=1;i<=100;i++)
//		{
//			exe.execute(new WeddingCardWrap());
//		}
		
		ScheduledExecutorService exe = Executors.newScheduledThreadPool(3);
		
		//exe.schedule(new WeddingCardWrap(), 3, TimeUnit.SECONDS);
		
		//exe.scheduleAtFixedRate(new WeddingCardWrap(), 10, 2, TimeUnit.SECONDS);
		
		exe.scheduleWithFixedDelay(new WeddingCardWrap(), 10, 2, TimeUnit.SECONDS);
		
	}

}
