package LinkedList;
import java.util.Scanner;
public class menu {

	public void Menu()
	{
		LinkedList LinkedList=new LinkedList();

		Scanner sc=new Scanner(System.in);
		i:while(true) {
			System.out.println("1.Insert");
			System.out.println("2.Append");
			System.out.println("3.Delete");
			System.out.println("4.Exit");
			System.out.println("5.Show FEMALE Employees ");
			System.out.println("6.Show MALE Employees ");
			System.out.println("Enter the choice:");

			int choice=sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter the Id | Name | Gender:");
				employee e =new employee(sc.nextInt(),sc.next(),sc.next());
				LinkedList.insert(e);
				System.out.println(LinkedList);
				break;
			case 2:
				System.out.println("Enter the Id | Name | Gender:");
			    employee a =new employee(sc.nextInt(),sc.next(),sc.next());
				LinkedList.append(a);
				System.out.println(LinkedList);
				break;
			case 3:
				System.out.println("1.Delete from First");
				System.out.println("2.Delete from Last");
				System.out.println("3.Delete All");
				int i = sc.nextInt();
				if(i==1) {
					//delete from first
					LinkedList.deleteFirst();
					System.out.println(LinkedList);
				}
				else if (i==2) {
					//delete from last
					LinkedList.deleteLast();
					System.out.println(LinkedList);
				}
				else {
					LinkedList.deleteAll();
					System.out.println(LinkedList);
				}
				break;
			case 4:
				break i;
			case 5:
				LinkedList.getGenderofFemale();
				break;	
			case 6:
				LinkedList.getGenderofMale();
				break;	
			default:
				System.out.println("Invalid Input");
				break;
			}
		}
	}
}