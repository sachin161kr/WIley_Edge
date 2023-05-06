package lambda;

interface Sayable {
	void say();
}

interface GetInfo{
	Info getMsg (String s);
}


class Info
{
	Info(String s)
	{
		System.out.println(s);
	}
}

public class MethodReference {

	public void saying()
	{
		System.out.println("Heyyyyyyyyyy ");
	}
	
	public static void saySomething()
	{
		System.out.println("Hello");
	}
	
	public static void processing()
	{
		System.out.println("Processing....");
	}
	
	public static void main(String[] args) {
	
		 Sayable sayable = MethodReference::saySomething;
		 
		 sayable.say();
		 
		 Thread t1 = new Thread(MethodReference::processing);
        
		 t1.start();
		 
		 MethodReference mt = new MethodReference();
		 
		 Sayable isv = mt::saying;
		 
		 isv.say();
		 
		 Thread t2 = new Thread(new MethodReference()::saying);
		 
		 t2.start();
		 
		 GetInfo info = Info::new;
		 
		 info.getMsg("sachin");
	}

}
