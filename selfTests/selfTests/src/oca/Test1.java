class A{
   private int i = 10;
   public void  f(){}
   public void g(){}
}

class B extends A{
   public int i = 20;
   public void g(){}
}

public class Test1{
   A a = new A();//1
   A b = new B();//2
   //System.out.println(b.i);
   public static void main(String atgs[]) {
	String s = " aa " + null;   
	System.out.println(s.equals(" aa null"));
	System.out.println(s);
	}
}