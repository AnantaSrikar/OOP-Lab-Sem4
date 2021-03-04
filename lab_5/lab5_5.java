class lab5_5
{
	public static void main(String args[])
	{
		try
		{
			
			int max_terms = Integer.parseInt(args[0]);
			
			int a = 0;
			int b = 1;
			int c = 1;
			
			System.out.println(a);
			System.out.println(b);
			
			for(int i = 2; i < max_terms; i++)
			{
				c = a + b;
				a = b;
				b = c;
				System.out.println(c);
			}
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Please provide an arg");
		}
	}
}
