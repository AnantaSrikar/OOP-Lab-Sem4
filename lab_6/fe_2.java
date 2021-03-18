class fe_2
{
	public static void main(String args[])
	{
		int [][]arr_2D = new int[10][];
		
		// Cannot initialise arrays with for-each loop, hence using regular one		
		for(int i = 0; i < arr_2D.length; i++)
			arr_2D[i] = new int[arr_2D.length - i];
			
		for(int i = 0; i < arr_2D.length; i++)
			for(int j = 0; j < arr_2D[i].length; j++)
				arr_2D[i][j] = i + j + 1;
				
		for(int []i : arr_2D)
		{
			for(int j : i)
				System.out.print(j + " ");
			System.out.println();
		}
	}
}
