package JavaThreads;

public class DeadlockConcept {
	
	  public static Object lock1  = new Object();
      
      public static Object lock2 = new Object();
      
      public static void main(String [] args)
      {
    	  System.out.println("hello world");
      }
      
     public static class LockThread extends Thread
     {
    	 public void run()
    	 {
    		 synchronized (lock1)
    		 {
    			 System.out.println("Thread 1 hold : lock 1");
    			 
    			 try {
					 Thread.sleep(5000);
				} catch (Exception e) {
					e.printStackTrace();
				}
    		 }
    		 
    		 System.out.println("Thread 1 is waiting for lock2");
    		 
    		 synchronized(lock2)
    		 {
    			 System.out.println("Thread one hold : lock2");
    		 }
    	 }
     }

}
