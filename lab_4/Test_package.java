// Demostrates lab4_3 case 1 and lab4_4 case 2
package Test_package;

public class Test_package
{
	public int a = 60;
	private int b = 70;
	protected int c = 80;
}

class Main
{
	public static void main(String args[])
	{
		Test_package t = new Test_package();
		
		System.out.println("t.a = " + t.a);
		// System.out.println("t.b = " + t.b); // Won't work because private
		System.out.println("t.c = " + t.c);
	}
}