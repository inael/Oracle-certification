package threads;

public class Queen   
{
    public static void main(String args[]) throws Exception 
    {
        Test test = new Test();
        test.start();
        System.out.println("aaaa");
    }
}

class Test extends Thread
{
    public void run()
    {
            interrupt();
            
            synchronized (System.out){
            	try {
            		System.out.wait(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}  
             }
            
            System.out.println(isInterrupted());
            System.out.println(interrupted());
    }
}