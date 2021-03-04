class lab5_6
{
	public static void main(String args[])
	{
		try
		{
			
			String num = args[0];
			
			int num_length = num.length();
			
			boolean isPalindrome = true;
			
			for(int i = 0; i < num_length / 2; i++)
				if(num.charAt(i) != num.charAt(num_length - 1 - i))
					{
						isPalindrome = false;
						break;
					}
					
			if(isPalindrome)
				System.out.println(num + " is a palindrome");
				
			else
				System.out.println(num + " is not a palindrome");
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Please provide an arg");
		}
	}
}
