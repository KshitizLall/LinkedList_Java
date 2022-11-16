package LinkedList;

public class node {
	public employee data;
	public node next;
	
	public node()
	{
		next = null;
	}
	
	public node(employee data)
	{
		this.data = data;
		next = null;
	}
	
	public node(employee data, node next)
	{
		this.data = data;
		this.next = next;
	}
	
	public String toString() 
	{
		String str ="";
		str = str + "" +data+"";
		return str;
	}
}
