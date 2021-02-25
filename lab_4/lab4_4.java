package lab4_4;
import Test_package.*;

class lab4_4 extends Test_package
{
	public static void main(String args[])
	{
		Test_package tp = new Test_package();

		System.out.println("tp.a = " + tp.a);
		// System.out.println("tp.b = " + tp.b); // Wont work because private
		System.out.println("tp.c = " + tp.c); // Won't work because proctected, and class is not inherited
	}
}