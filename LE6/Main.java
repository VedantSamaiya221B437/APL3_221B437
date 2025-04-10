
public class Main
{
	public static void main(String[] args) {
		Offering obj = new Tea();
		Rum rum = new Rum(obj);
		Gin gin = new Gin(rum);
		Icecream icec=new Icecream(gin);
		System.out.println(icec.getname());
		System.out.println(icec.getprice());
	}
}
