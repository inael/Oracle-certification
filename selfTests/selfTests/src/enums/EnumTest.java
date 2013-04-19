package enums;

enum Animal {CROCODILE, HIPOPOTAMUS, RABBIT, DOG, CAT, NEW}

public class EnumTest {
	
	protected enum Animals {CROCODILE, HIPOPOTAMUS, DOG, CAT, NEW}
	
	public static void main(String[] args)
	{
		Animals animal2=Animals.HIPOPOTAMUS;
		Animals animal1=Animals.CAT;
		System.out.println("Animals2=Animals: "+animal2.compareTo(animal1));
		animal1=Animals.DOG;
		animal2=Animals.DOG;
		System.out.println("animal1.equals(animal2): "+animal1.equals(animal2));
		Object object1=new Object();
		Object object2=new Object();
		System.out.println("object1.equals(object2): "+object1.equals(object2));
		System.out.println("animal2.getClass(): "+animal2.getClass().getName());
		System.out.println("animal2.hashCode(): "+animal2.hashCode());
		System.out.println("animal2.name(): "+animal2.name());
		System.out.println("animal2.getDeclaringClass(): "+animal2.getDeclaringClass());
		
		
		System.out.println("animal2.name(): "+animal2.name());
		System.out.println("animal2.ordinal(): "+Animals.NEW.ordinal());
		
		System.out.println("animal1 = animal2"+(animal1 = animal2));
		//System.out.println("animal1 > animal2"+(animal1 > animal2)); compile error
		//System.out.println("animal1 + animal2"+(animal1 + animal2)); compile error
		//animal1.compareTo(o)
		
	}

}
