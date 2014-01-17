class Cert
{
    public static void main(String[] args)
    {
        new Cert().go();
    }
    public void go()
    {
        Feast.ing feast = Feast.ing.Less; // 1
        Feast f = new Feast(); Feast.ing feast11 =Feast.ing.More; // 2
        Feast.ing feast3 = Feast.ing.NotAtAll; // 3
        boolean x = (Feast.ing.More != Feast.ing.Less); // 4
        Feast.ing.More.ordinal(); // 5 
    }
}
class Feast
{
    enum ing
    {
        More, Less, NotAtAll;
    };
}