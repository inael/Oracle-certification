package enums;

public class WithInterface {

	private enum Animals implements Runnable {
		//private d;
		CROCODILE, HIPOPOTAMUS, DOG {
			private int i;
		},
		CAT, NEW;

		public void run() {
			System.out.println("Rhread run");
		}
	}
	
	public static void main(String[] args)
	{
		Animals animal1=Animals.CROCODILE;
		//animal1.run();
		Thread thread = new Thread(animal1);
		thread.start();
	}

}
