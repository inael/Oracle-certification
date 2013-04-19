package enums;


public class CloneTest {
	
	enum Season { 
		WINTER, SPRING, SUMMER;
		private Object season;
		Season()
		{
			//new java.lang.Enum();
			try {
				this.season=this.clone();
			} catch (CloneNotSupportedException e) {
				e.printStackTrace();
			}			
		}
		
		}
	
	/*
	class enum2 extends java.lang.Enum<Enum<E>>
	{
		
	}
	*/
	
	public static void main(String[] args)
	{		
		Season season=Season.SPRING;
		//Season season2=(Season) season.clone();
		System.out.println("Season.class.getSuperclass()="+Season.class.getSuperclass());
		//new java.lang.Enum();
	}

}
