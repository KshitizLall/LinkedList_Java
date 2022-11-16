package LinkedList;

public class LinkedList {
	private node head;

	public LinkedList() { head = null;	}

	public void insert(employee data)
	{
		node temp = new node(data);
		if(head == null) { head = temp;	}
		else
		{
			head.next = head;
			head = temp;
		}
	}

	public void append(employee data)
	{
		node temp = new node(data);
		if(head == null) { head = temp;	}
		else
		{
			node x = head;
			while(x.next!=null)
			{
				x=x.next;
			}
			x.next=temp;
		}
	}

	public void deleteFirst()
	{

		if(head != null)
		{
			if(head.next==null) {node x = head;	head = null; x.next=null; }
			else
			{
				node x = head;
				head = head.next;
				x.next = null;
			}
		}
		else
		{
			System.out.println("Empty");
		}
	}

	public void deleteLast()
	{

		if(head != null)
		{
			if(head.next==null)	{node x = head; head = null; x.next=null; }
			else
			{
				node itp = null;
				node it = head;
				while(it.next != null)
				{
					itp = it;
					it = it.next;
				}
				it.next = null;
			}
		}
		else
		{
			System.out.println("Empty");
		}
	}
	
	public void deleteAll()
	{

		if(head != null)
		{
			head=null;
		}
		else
		{
			System.out.println("Empty");
		}
	}

	public void getGenderofFemale() 
	{
		node x = head;
		while(x!=null)
		{
			String st = x.data.getGender();
			if(st.equals("F")) { System.out.println(x); }
		}
		x=x.next;
	}

	public void getGenderofMale() 
	{
		node x = head;
		while(x!=null)
		{
			String st = x.data.getGender();
			if(st.equals("M"))	{ System.out.println(x); }
		}
		x=x.next;
	}

	public String toString()
	{
		String str = "";
		if(head==null) { System.out.println("Empty"); }
		else 
		{
			node x = head;
			while(x!=null) 
			{
				str = str +"["+x+" "+"]-->";
				x=x.next;
			}
			
		}
		return str;
	}
}
