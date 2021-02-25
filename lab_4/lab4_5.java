class lab4_5
{
	public static void main(String args[])
	{
		try
		{
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			System.out.println("Sum of " + a + " and " + b + " is " + (a + b));
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Please provide 2 args");
		}
	}
}