package strinclassJava;

public class StringBuilderClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		StringBuilder sb = new StringBuilder("Wiley");
		
		StringBuilder logMessage = new StringBuilder();
		
		long timeStamp = System.currentTimeMillis();
		
		logMessage.append("[Stamp : ").append(timeStamp).append("] ");
		
		int userId = 123456;
		
		logMessage.append("User ").append(userId).append(": ");
		
		String message = "Logged In Successfully";
		
		logMessage.append(message);
		
		System.out.print(logMessage.toString());
		
	}

}
