import java.io.Serializable;
import java.util.*;
class Tiny implements Serializable
{
    public static void main(String[] args)
    {
        List <? extends Serializable> list; // #1
        list = new ArrayList<String>(); // #2
        list = new ArrayList<Integer>(); // #3
        //list = new ArrayList<this>(); // #4
        list = new ArrayList<Serializable>(); // #5
		Serializable s = new Tiny();
		Object o = new Integer(0);
        list.add(s); // #6
        list.add(((Serializable)new String())); // #7
    }
}