package OptimisationTechniques;

public class StringOptimize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuilder sb = new StringBuilder();
      
		long start  = System.currentTimeMillis();
		
		String result = "";
		
		for(int i=0;i<10000;i++)
		{
			//result += i;
			sb.append(i);
		}
		
		long end = System.currentTimeMillis();
		
		System.out.println(end-start);
		
       start = System.currentTimeMillis();
		
	String result2 ="";
		
		for(int i=0;i<10000;i++)
		{
			
			  result += i;
		}
		
		end = System.currentTimeMillis();
		
		System.out.println(end-start);
		
		start = System.currentTimeMillis();
		
		
		
		for(int i=0;i<10000;i++)
		{
			result2 = result2 + i;
		}
		
		end = System.currentTimeMillis();
		
		System.out.println(end - start);
		
		
	}

}
