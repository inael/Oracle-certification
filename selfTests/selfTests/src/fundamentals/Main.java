package fundamentals;

public class Main  
{
    public static void main(String... args)
    {
        new Main().dodo();
    }
    
    public void dodo()
    {
        //stanley(10,11,15,-1);
        stanley(new Integer(10),new Integer(11),new Integer(15),new Integer(-1));
    }
    
    public void stanley(int... args)
    {
        System.out.print("int " + args.length);
    }    
    public void stanley(Integer... args)
    {
        System.out.print("integer " + args.length);
    }
}