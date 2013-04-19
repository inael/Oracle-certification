package enums;

public class SeasonsTest {
	
	enum Season { WINTER, SPRING, SUMMER, AUTUMN }
	
	public static void main(String[] args)
	{		
		Season season = Season.SPRING;
		if (season == Season.SPRING) season = Season.SUMMER;
		System.out.println("season.ordinal()="+season.ordinal());
		System.out.println(season.toString());
		//java.lang.Enum;
	}

}
