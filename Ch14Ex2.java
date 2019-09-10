import java.util.*;
public class Ch14Ex2
{
	public static void main(String args[])
	{
		ArrayList<Contact> contactList = new ArrayList<Contact>();
		Scanner input = new Scanner(System.in);

		while(true)
		{
			System.out.println("1: Add Contact");
			System.out.println("2: Display Contacts");
			System.out.println("3: Find Contact");
			System.out.println("4: Delete Contact");
			System.out.println("0: Exit");

			int sel = input.nextInt();
			input.nextLine();
			System.out.println();

			if(sel == 0)
				break;

			switch(sel)
			{
			case 1:
				System.out.print("First name: ");
				String f = input.nextLine();
				System.out.print("Last name: ");
				String l = input.nextLine();
				System.out.print("Phone number: ");
				String p = input.nextLine();
				System.out.print("Email address: ");
				String e = input.nextLine();
				contactList.add(new Contact(f, l, p, e));
				break;
			case 2:
				for(Contact con: contactList)
					con.printC();
				break;
			case 3:
				System.out.println("Info to Find: ");
				String info = input.nextLine();
				Contact con = findPerson(contactList, info);	
				if(con != null)
					con.printC();
				else
					System.out.println("Nothing Here");

				break;

			case 4:
				System.out.println("Info to Find: ");
				String inf = input.nextLine();
				Contact cont = findPerson(contactList, inf);
				if(cont != null)
				{
					cont.printC();
					System.out.println("Confirm: Y/N");
					String del = input.nextLine();
					System.out.println();
					
					if(del.equalsIgnoreCase("y"))
					{
						contactList.remove(cont);
					}
				}
				else
					System.out.println("Nothing Here");

				break;
			}
		}
		input.close();
	}

	private static Contact findPerson(ArrayList<Contact> contactList, String info)
	{
		Contact c = null;
		for(Contact con: contactList)
		{
			if(contactList.get(i).getFirstName().contains(info))
				c = contactList.get(i);

			if(contactList.get(i).getLastName().contains(info))
				c = contactList.get(i);

			if(contactList.get(i).getPhone().contains(info))
				c = contactList.get(i);

			if(contactList.get(i).getEmail().contains(info))
				c = contactList.get(i);
		}
		return c;
	}
}