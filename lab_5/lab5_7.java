class lab5_7
{
	static boolean isPrime(int num)
	{
		boolean is_prime = true;
		
		for(int i = 2; i < num; i++)
			if(num % i == 0)
			{
				is_prime = false;
				break;
			}
		
		return is_prime;
				
	}
	
	public static void main(String args[])
	{
		try
		{
			
			int max_num = Integer.parseInt(args[0]);
			
			for(int i = 1; i < max_num; i++)
				if(isPrime(i))
					System.out.println(i);
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Please provide an arg");
		}
	}
}
