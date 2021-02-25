// Also handles lab4_3 Case 1 and lab4_4 case 1

class lab4_2
{
	public static void main(String args[])
	{
		Test t = new Test();
		// System.out.println("t.a = " + (t.a)); // Not gonna work
		System.out.println("t.b = " + (t.b));
	}
}

class Test
{
	private int a = 10;
	public int b = 25;
	protected int c = 30;
}