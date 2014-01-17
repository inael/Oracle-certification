class Cert
{
    public static void main(String[] args)
    {
        new Cert().go(args);
    }
    
    public void go(String... args)
    {
        Object o = null;
        print( (true) ^ o == null ? change(args[1]) : change(args[1]) );
		print ( true && o == null ? "sss" : "" );
    }
    
    String change (String x)
    {
        x += "3";
        return x;
    }
    
    void print(String x)
    {
        System.out.println(x);
    }
}