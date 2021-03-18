class lab6_2
{
	public static void main(String args[])
	{
		int [][]arr_2D = new int[10][];
		
		for(int i = 0; i < arr_2D.length; i++)
			arr_2D[i] = new int[arr_2D.length - i];
			
		for(int i = 0; i < arr_2D.length; i++)
			for(int j = 0; j < arr_2D[i].length; j++)
				arr_2D[i][j] = i + j + 1;
			
		for(int i = 0; i < arr_2D.length; i++)
		{
			for(int j = 0; j < arr_2D[i].length; j++)
				System.out.print(arr_2D[i][j] + " ");
			System.out.println();
		}
	}
}
