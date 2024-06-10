package in.student;
public class college_details 
{
	private String name;
	private int rollno;
	private address add;
	public college_details(String name,int rollno,address add)
	{		
		this.name=name;
		this.rollno=rollno;
		this.add=add;
	}
	public void display()
	{
		System.out.println("name is :"+name);
		System.out.println("roll no is :"+rollno);
		System.out.println("address is :"+add);
	}
}
