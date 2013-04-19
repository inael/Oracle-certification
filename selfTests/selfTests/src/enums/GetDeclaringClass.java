package enums;

import java.lang.reflect.Field;

public class GetDeclaringClass {
	
	protected enum Animals 
	{
	 CROCODILE(12)
	 {
		 public int getWeight()
		 {
			 return 95;
		 }
		 
		 public int getWeight2()
		 {
			 return 96;
		 }
	 },
	 HIPOPOTAMUS(112), DOG(15), CAT(25);
	 Animals(int weight)
	 {
		 this.weight=weight;
	 }
	 private int weight;
	 public int getWeight()
	 {
		 return this.weight;
	 }
	 
	 public int getWeight2()
	 {
		 return 010;
	 }
	 
	}
	
	public static void main(String[] args)
	{		
		Animals croc=Animals.CROCODILE;
		Animals hyp=Animals.HIPOPOTAMUS;
		System.out.println("croc weight="+croc.getWeight());
		System.out.println("hyp weight="+hyp.getWeight());
		System.out.println("croc weight2="+croc.getWeight2());
		System.out.println("hyp weight2="+hyp.getWeight2());
		
		Class<? extends Animals> croc2=croc.getClass();
		Field[] fields = croc2.getFields();
		for (Field field:fields)
		{
			System.out.println("field="+field);
		}
		
		System.out.println("croc.getClass()="+croc.getClass());
		System.out.println("croc.getDeclaringClass()="+croc.getDeclaringClass());	
		
		
		System.out.println("hyp.getClass().getName()="+hyp.getClass());
		System.out.println("hyp.getDeclaringClass().getName()="+hyp.getDeclaringClass());
		
		System.out.println("hyp.hashCode()"+hyp.hashCode());
	}

}
