package pack2;
import pack1.A;

public class C extends A
{
	public static void main(String[] args)
	{
		//A a = new A();      this can't be done b/c of m1 is protected in A
		//a.m1();

		C c = new C();
		c.m1();

		//A a1 = new C();		this can't be done b/c of m1 is protected in A
		//a1.m1();
	}
}