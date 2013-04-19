package enums;

class LookupUtil {
	public static <E extends Enum<E>> E lookup(Class<E> e, String id) {
		E result = null;
		try {
			result = Enum.valueOf(e, id);
		} catch (IllegalArgumentException e2) {
			// log error or something here

			throw new RuntimeException("Invalid value: " + id);
		}

		return result;
	}
}

public class valueOf {

	enum Season {
		WINTER, SPRING, SUMMER;
		private Object season;

		Season() {

		}

		static public Season lookup(String id) {
			return LookupUtil.lookup(Season.class, id);
		}

		public String toString() {
			String r = "";
			if (this.compareTo(WINTER) == 0) {
				r = "Winter!";
			}
			return r;
		}

		double eval2(double x, double y) {
			switch (this) {
			case WINTER:
				return x + y;
			case SPRING:
				return x - y;
			case SUMMER:
				return x * y;
			}
			// return 1.2;
			throw new AssertionError("Unknown op: " + this);
		}
		

		/*
		 * protected void finalize() { }
		 */

	}
		

	/*
	 * class enum2 extends java.lang.Enum<Enum<E>> {
	 * 
	 * }
	 */

	public static void main(String[] args) {
		Season season = Season.SPRING;
		System.out.println("season.lookup(\"WINTER\")="
				+ Season.lookup("WINTER"));
		// System.out.println("season.lookup(\"wINTER\")="+season.lookup("wINTER"));
		// //java.lang.RuntimeException
		// System.out.println("season.lookup(\"wINTER2\")="+season.lookup("wINTER2"));
		// //java.lang.RuntimeException
		// System.out.println("season.valueOf(\"wINTER\")="+season.valueOf("wINTER"));//java.lang.IllegalArgumentException
		Class<Season> s = Season.class;
		System.out.println("Season.valueOf(Season.class, \"WINTER\")="
				+ Season.valueOf(s, "WINTER"));
		// System.out.println("Season.valueOf(null)="+Season.valueOf(null));
		// compile error
		Season s2 = Season.valueOf(s, "WINTER");
		System.out.println("Season.valueOf(\"WINTER\"))="
				+ Season.valueOf("WINTER"));
		// System.out.println("Season.valueOf(\" WINTER\"))="+Season.valueOf(" WINTER"));
		// compile error
		// System.out.println("Season.valueOf(\"WINTER \"))="+Season.valueOf("WINTER "));//compile
		// error
		
	}

}
