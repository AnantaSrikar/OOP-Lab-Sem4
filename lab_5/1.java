class room
{
	int roomno;
	String roomtype;
	int roomarea;
	String ACmachine;
	
	void setData(int roomno, String roomtype, int roomarea, String ACmachine)
	{
		this.roomno = roomno;
		this.roomtype = roomtype;		
		this.roomarea = roomarea;
		this.ACmachine = ACmachine;
	}
	
	void displayData()
	{
		System.out.println("roomno: " + roomno + "\nroomtype: " + roomtype + "\nroomarea: " + roomarea + "\nACmachine: " + ACmachine + "\n");
	}
	
	public static void main(String args[])
	{
		try
		{
			
			int max_rooms = Integer.parseInt(args[0]);
			
			if(args.length != max_rooms * 4 + 1)
					throw new ArrayIndexOutOfBoundsException("Incorrect number of arguments!");
			
			room r[] = new room[max_rooms];
			
			int room_index = 0;
			
			for(int i = 1; i <= (max_rooms) * 4; i += 4)
			{
				r[room_index] = new room();
				int roomno = Integer.parseInt(args[i]);
				String roomtype = args[i + 1];
				int roomarea = Integer.parseInt(args[i + 2]);
				String ACmachine = args[i + 3];
				
				r[room_index].setData(roomno, roomtype, roomarea, ACmachine);
				
				room_index++;
			}
			
			System.out.println("\nDisplaying all room's data:");
			
			for(int i = 0; i < max_rooms; i++)
				r[i].displayData();
				
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Incorrect number of arguments entered. Please check and try again.");
		}
		
		catch(NumberFormatException e)
		{
			System.out.println("Incorrect Values entered. Please check and try again.");
		}

	}
}
