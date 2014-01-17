package apiContents;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Print 
{
    public static void main(String args[])   
    {
        Pattern pattern = Pattern.compile("\\d\\s[a-z]+");
        Matcher matcher = pattern.matcher("123 a 34a ");
        while (matcher.find())
        {
            System.out.println(matcher.start() + " " );
			System.out.println(matcher.group() + " " );
        }
    }
}