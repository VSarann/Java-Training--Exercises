package T1;

public class T1 {

	public static void main(String[] args) {
		System.out.print("Hello World\n");
		
		int a;
		float b;
		char c;
		long d;
		double e;
		
		System.out.println("Size of int: " + (Integer.SIZE/8) + " bytes.");
		System.out.println("Size of float: " + (Float.SIZE/8) + " bytes.");
		System.out.println("Size of char: " + (Character.SIZE/8) + " bytes.");
		System.out.println("Size of long: " + (Long.SIZE/8) + " bytes.");
		System.out.println("Size of double: " + (Double.SIZE/8) + " bytes.");
		
		System.out.println("\nJava Version: "+System.getProperty("java.version"));
	    	System.out.println("Java Runtime Version: "+System.getProperty("java.runtime.version"));
	    	System.out.println("Java Home: "+System.getProperty("java.home"));
	    	System.out.println("Java Vendor: "+System.getProperty("java.vendor"));
	    	System.out.println("Java Vendor URL: "+System.getProperty("java.vendor.url"));
	    	System.out.println("Java Class Path: "+System.getProperty("java.class.path")+"\n");
	}
}
