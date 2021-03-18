class lab6_1
{
	public static void main(String args[])
	{
		int []arr_1D = new int[10];
		
		for(int i = 0; i < arr_1D.length; i++)
			arr_1D[i] = arr_1D.length - i;
			
		for(int i = 0; i < arr_1D.length; i++)
			System.out.println(arr_1D[i]);
	}
}
