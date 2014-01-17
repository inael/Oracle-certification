package apiContents;
import java.io.File;
import java.io.IOException;

class Test1 {

	public static void main() {
		System.out.println("bbbbb");
	}
	
	public static void main(String[] args) throws IOException {
		System.out.println("cccc");
		File f1=new File("cc.txt");
		f1.createNewFile();
		f1.renameTo(new File("vvv.txt"));
		System.out.println("cccc "+f1.getCanonicalPath());		
	}
	
}