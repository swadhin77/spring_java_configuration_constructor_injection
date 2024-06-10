package in.student;
public class address
{   
	private int houseno;
	private String city;
	private long pin;
	public address(int houseno,String city,long pin)
	{
		this.houseno=houseno;
		this.city=city;
		this.pin=pin;
	}
	@Override
	public String toString() {
		return "hno is : "+houseno+" city is : "+city+" pin code is : "+pin;
	}
	
}
