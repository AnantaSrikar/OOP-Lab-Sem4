class lab5_1
{
	public static void main(String args[])
	{
		try
		{
			int limit = Integer.parseInt(args[0]);
			
			System.out.println("Displaying all even numbers upto " + limit);
			for(int i = 0; i <= limit; i++)
				if(i % 2 == 0)
					System.out.println(i);
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Please provide one arg");
		}
	}
}
