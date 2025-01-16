
public class LE0
{
	int age;
	String name;
	public void setage(int a)
	{
		this.age=a;
	}
	public void setname(String n)
	{
		this.name=n;
	}
	public int getage()
	{
		return this.age;
	}
	public String getname()
	{
		return this.name;
	}

	public static void main(String[] args)
	{
		Juet test =new LE0();
		test.setage(21);
		test.setname("Vedant");
		System.out.println("Age="+test.getage());
		System.out.println("Name="+test.getname());

	}




}

