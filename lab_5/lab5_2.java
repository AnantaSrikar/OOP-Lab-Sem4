class lab5_2
{
	public static void main(String args[])
	{
		try
		{
			int limit = Integer.parseInt(args[0]);
			int fact = 1;
			
			for(int i = 1; i <= limit; i++)
				fact *= i;
				
			System.out.println(limit + "! = " + fact);
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Please provide one arg");
		}
	}
}

