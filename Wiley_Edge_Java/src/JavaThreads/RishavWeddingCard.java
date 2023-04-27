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
		
		ExecutorService exe = Executors.newFixedThreadPool(4);

		for(int i=1;i<=100;i++)
		{
			exe.execute(new WeddingCardWrap());
		}
	}

}
