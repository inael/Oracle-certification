package enums;

enum Animal {CROCODILE, HIPOPOTAMUS, RABBIT, DOG, CAT, NEW}


public class EnumTest {
	
	protected enum Animals {CROCODILE, HIPOPOTAMUS, 
		DOG { private int i; }, 
		CAT, NEW}
	enum Animals3 {
		ANIMAL1, ANIMAL2;
		public boolean b;
		}

	
	public static void main(String[] args)
	{
		Animals animal2=Animals.HIPOPOTAMUS;
		Animals animal1=Animals.CAT;
		Animals3 animal3=Animals3.ANIMAL1;
		System.out.println("Animals2=Animals: "+animal2.compareTo(animal1));
		//System.out.println("animal2.compareTo(null) = "+animal2.compareTo(null));//Exception in thread "main" java.lang.NullPointerException
		//System.out.println("Animals2=Animals: "+animal2.compareTo(Animals3.ANIMAL1));//compile error
		animal1=Animals.DOG;
		animal2=Animals.DOG;
		System.out.println("animal1.equals(animal2): "+animal1.equals(animal2));
		Object object1=new Object();
		Object object2=new Object();
		System.out.println("object1.equals(object2): "+object1.equals(object2));
		System.out.println("animal2.getClass(): "+animal2.getClass().getName());
		System.out.println("animal2.hashCode(): "+animal2.hashCode());
		System.out.println("animal2.name(): "+animal2.name());
		System.out.println("animal2.getClass(): "+animal2.getClass());
		System.out.println("animal2.getDeclaringClass(): "+animal2.getDeclaringClass());
		
		
		System.out.println("animal2.name(): "+animal2.name());
		System.out.println("animal2.ordinal(): "+Animals.NEW.ordinal());
		
		System.out.println("animal1 = animal2"+(animal1 = animal2));
		//System.out.println("animal1 > animal2"+(animal1 > animal2)); compile error
		//System.out.println("animal1 + animal2"+(animal1 + animal2)); compile error
		//animal1.compareTo(o)
		
		System.out.println("Animals3.valueOf(\"ANIMAL1\")="+Animals3.valueOf("ANIMAL2"));
		//System.out.println("Animals3.valueOf(\"ANIMAL1\")="+Animals3.valueOf("DOG"));//Exception
		//System.out.println("Animals3.valueOf(\"ANIMAL1\")="+Animals3.valueOf(null));//Exception in thread "main" java.lang.NullPointerException: Name is null		
		
		System.out.println("Animals.class.getSuperclass()="+Animals.class.getSuperclass());
		System.out.println("animal1.getClass().getSuperclass()="+animal1.getClass().getSuperclass());
		System.out.println("animal1.getClass().getSuperclass().getSuperclass()="+animal1.getClass().getSuperclass().getSuperclass());
		
		System.out.println("animal3.b="+animal3.b);
		
	}

}
