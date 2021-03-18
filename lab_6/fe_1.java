class fe_1
{
	public static void main(String args[])
	{
		int []arr_1D = new int[10];
		
		// Cannot initialize array elements with for-each loop
		for(int i = 0; i < arr_1D.length; i++)
			arr_1D[i] = arr_1D.length - i;
			
		for(int i : arr_1D)
			System.out.println(i);
	}
}
