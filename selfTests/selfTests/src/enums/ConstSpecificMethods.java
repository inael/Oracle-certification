package enums;


public class ConstSpecificMethods {
	
	public enum Operation {
		PLUS {
			double eval(double x, double y) {
				return x + y;
			}
		},
		MINUS {
			double eval(double x, double y) {
				return x - y;
			}
		},
		TIMES {
			double eval(double x, double y) {
				return x * y;
			}
		},
		DIVIDE {
			int getD()
			{
				return 57;
			}
			/*
			double eval(double x, double y) {
				return x / y;
			}
			*/
		};
		
		private int d;
		
		Operation()
		{
			d=getD();
		}
		
		int getD()
		{
			return 54;
		}
		
		public int getD2()
		{
			return d;
		}

		// Do arithmetic op represented by this constant
		//abstract double eval(double x, double y);
		double eval(double x, double y) {
			return 0;
		}
	}
	
	public static void main(String[] args) {
		Operation operation=Operation.PLUS;
		operation.eval(1, 2);
		System.out.println("operation.eval(1, 2)="
				+ operation.eval(1, 2));
		
		Operation operation2=Operation.TIMES;
		Operation operation3=Operation.DIVIDE;
		System.out.println("operation2="
				+ operation2.getD2());
		System.out.println("operation3="
				+ operation3.getD2());
		
		System.out.println("Operation.DIVIDE.getD()="
				+ Operation.DIVIDE.getD());
		System.out.println("Operation.TIMES.getD()="
				+ Operation.TIMES.getD());
		
	}

}
