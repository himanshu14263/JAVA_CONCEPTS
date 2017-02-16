package pack1;
public class A
{
	protected void m1()
	{
		System.out.println("most misunderstood modifier\n");
	}
}

class B extends A
{
	public static void main(String[] args)
	{
		A a = new A();
		a.m1();

		A b = new B();
		b.m1();

		A a1 = new A();
		a1.m1();

	}
}