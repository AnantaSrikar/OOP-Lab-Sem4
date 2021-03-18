class fe_3
{
	public static void main(String args[])
	{
		int [][][]arr_3D = new int[10][][];
		
		// Cannot initialise arrays with for-each loop, hence using regular one		
		for(int i = 0; i < arr_3D.length; i++)
		{
			arr_3D[i] = new int[arr_3D.length - i][];
			
			for(int j = 0; j < arr_3D[i].length; j++)
				arr_3D[i][j] = new int[i + j + 1];
		}
			
		for(int i = 0; i < arr_3D.length; i++)
			for(int j = 0; j < arr_3D[i].length; j++)
				for(int k = 0; k < arr_3D[i][j].length; k++)
					arr_3D[i][j][k] = i + j + k + 10;
					
		for(int [][]i : arr_3D)
		{
			System.out.print("i at " + i + "\n");
			for(int []j : i)
				for(int k : j)
					System.out.print(k + " ");
			System.out.print("\n\n");
		}
	}
}
