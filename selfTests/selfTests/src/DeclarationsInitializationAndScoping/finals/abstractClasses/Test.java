package DeclarationsInitializationAndScoping.finals.abstractClasses;

abstract class abs1{
	abstract void f1();
}

abstract class abs2 extends abs1{
	void f1()
	{
		int a=2;
	}
}

class abs3 extends abs2
{	
}

abstract class cl
{
	
}

class cli extends cl
{	
}

public class Test {

}
