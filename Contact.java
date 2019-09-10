public class Contact 
{
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String email;

	public Contact(String firstName, String lastName, String phoneNumber, String email)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}
	public void setFirstName(String first)
	{
		firstName = first;
	}
	public String getFirstName()
	{
		return firstName;
	}
	public void setLastName(String last)
	{
		lastName = last;
	}
	public String getLastName()
	{
		return lastName;
	}
	public void setphNum(String phone)
	{
		phoneNumber = phone;
	}
	public String getPhone()
	{
		return phoneNumber;
	}
	public void setEmail(String email)
	{
		this.email = email;
	}
	public String getEmail()
	{
		return email;
	}
	public void printC()
	{
		System.out.print(this.getFirstName() + " " + this.getLastName() + " ");
		System.out.print(this.getPhone()+" ");
		System.out.println(this.getEmail());
		System.out.println();
	}
}