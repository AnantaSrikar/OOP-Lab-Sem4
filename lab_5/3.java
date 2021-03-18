class p3
{
	public static void main(String args[])
	{
		try
		{
			if(args.length != 3)
				throw new ArrayIndexOutOfBoundsException("Incorrect number of arguments!");
			
			int A = Integer.parseInt(args[0]);
			int B = Integer.parseInt(args[1]);
			int C = Integer.parseInt(args[2]);
			
			
			for(int a = 1; a <= A; a++)
				for(int b = 1; b <= B; b++)
					for(int c = 1; c <= C; c++)
						if(a * c > b * b)
							System.out.println("(" + a + ", " + b + ", " + c + ")");
			
		
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Please provide 3 args");
		}
	}
}

