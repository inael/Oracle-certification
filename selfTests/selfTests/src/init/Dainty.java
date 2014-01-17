package init;

public class Dainty implements sad 
{
    public static void main( String args[] )
    {
        new Dainty().go();
    }
    public void go()
    {
        System.out.println(tent++);
    }
}

interface sad
{
    int tent=0;
}