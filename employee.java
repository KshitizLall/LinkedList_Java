package LinkedList;

public class employee {
	private int empID;
	private String name;
	private String gender;
	
	public employee() 
	{
		empID=00;
		name="unknown";
		gender="F";
	}
	
	public employee(int empID, String name, String gender) 
	{
		this.empID=empID;
		this.name=name;
		this.gender=gender;
	}
	
	public String toString()
	{
		return ""+empID+"|"+name+"|"+gender;
	}

	public String getGender() {
		return gender;
	}
}
