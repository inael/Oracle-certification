package apiContents;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.File;
import java.io.Serializable;

public class Cert extends Hen
{
    transient int i = 10;

    volatile int y = 10;

    public static void main(String... args) throws Exception
    {
        Cert trim = new Cert();
        serialize(trim);
        Cert trim2 = deserialize();
        System.out.println(trim2.i + trim2.y + trim2.x);
    }

    private static Cert deserialize() throws Exception
    {
        File f = new File("test");
        ObjectInputStream stream = new ObjectInputStream(new FileInputStream(f));
        return (Cert)stream.readObject();
    }

    private static void serialize(Cert trim) throws Exception
    {
        File f = new File("test");
        ObjectOutputStream stream = new ObjectOutputStream(new FileOutputStream(f));
        stream.writeObject(trim);
        stream.flush();
        stream.close();
    }
}

class Hen implements Serializable
{
    int x = 10;
}