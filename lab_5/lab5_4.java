class lab5_4
{
	public static void main(String args[])
	{
		try
		{
			
			int year = Integer.parseInt(args[0]);
			
			if(year % 4 == 0)
				System.out.println(year + " is a leap year");
			
			else
				System.out.println(year + " is not a leap year");
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Please provide an arg");
		}
	}
}
