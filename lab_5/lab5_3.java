class lab5_3
{
	public static void main(String args[])
	{
		try
		{
			if(args.length != 2)
				throw new ArrayIndexOutOfBoundsException("Incorrect number of arguments!");
			
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			
			if(a > b)
				System.out.println(a + " is greater than " + b);
			
			else if(b > a)
				System.out.println(b + " is greater than " + a);
			
			else
				System.out.println("Both the numbers are equal");
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Please provide 2 args");
		}
	}
}
