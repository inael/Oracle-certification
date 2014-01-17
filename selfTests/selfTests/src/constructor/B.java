public class B {

	public void B() {
		System.out.println("Method b");
	}
	
	public B() {
		System.out.println("Construct b");
	}
	
	public static void main(String[] args) {
		new B().B();
	}
}