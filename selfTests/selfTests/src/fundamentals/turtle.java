package fundamentals;

public class turtle {
	
	public static void main(String [] args)
    {
        turtle t = new turtle();
        // #1
        System.gc(); 
        java.lang.Runtime.getRuntime().gc(); 
        System.getRuntime().gc(); 
        
    }

}
