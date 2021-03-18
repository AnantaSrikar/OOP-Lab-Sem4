class employee
{
	int eid;
	String ename;
	int sal;
	
	employee(int eid, String ename, int sal)
	{
		this.eid = eid;
		this.ename = ename;
		this.sal = sal;
	}
	
	void displayData()
	{
		System.out.println("eid: " + eid + "\nename: " + ename + "\nsal: " + sal + "\n");
	}
	
	public static void main(String args[])
	{
		try
		{
			int max_emps = Integer.parseInt(args[0]);
			
			if(args.length != max_emps * 3 + 1)
					throw new ArrayIndexOutOfBoundsException("Incorrect number of arguments!");
					
			employee emps[] = new employee[max_emps];
			
			int emp_index = 0;
			
			for(int i = 1; i <= (max_emps) * 3; i += 3)
			{				
				int eid = Integer.parseInt(args[i]);
				String ename = args[i + 1];
				int sal = Integer.parseInt(args[i + 2]);
				
				emps[emp_index] = new employee(eid, ename, sal);
				
				emp_index++;
			}
			
			System.out.println("\nDisplaying all employees' data whose salary is more than Rs.5000:");
			
			for(employee emp : emps)
				if(emp.sal > 5000)
					emp.displayData();
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
