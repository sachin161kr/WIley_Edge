package JavaThreads;

class BankAccount
{
	int amount = 1000;
	
	public synchronized void withdrawalAmount(int amout)
	{
		System.out.println("Amount to withdraw = "+amount);
		System.out.println("Available balance = "+this.amount);
		
		if(this.amount < amount)
		{
			System.out.println("Amount is less");
			
			try {
				wait();
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		System.out.println("Amount withdrawal successful");
	}
	
	public synchronized void depositAmount(int amount)
	{
		this.amount += amount;
		
		System.out.println("Amount Deposited");
		
		notify();
	}
}

public class InterCommunication {

	int amount = 1000;
	
	public static void main(String[] args) {
		
		BankAccount ba = new BankAccount();
		
		Thread t1 = new Thread()
				{
			        public void run()
			        {
			        	ba.withdrawalAmount(1500);
			        }
				};
				
				Thread t2 = new Thread(){
					public void run()
					{
						ba.depositAmount(1000);
					}
				};
				
				t1.start();
				t2.start();

	}

}
