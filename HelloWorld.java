package Universe;

class HiUniverse{
	
	static int y;
	int z=99;
	
	public void display() 
	{
		System.out.println("qqqqqqqqq");
		System.out.println("qqqqqqqqq");
	}
	
	public void display1() 
	{
		System.out.println("testingg");
		System.out.println("testingg");
	}
}
	public class Child{
	public static void main(String[] args) {
		
		HiUniverse a = new HiUniverse();
		a.display();
		a.display1();
		int x=90;
		System.out.println("Hii----->"+x);
		System.out.println("Hii----->"+a);
		System.out.println("Hii----->"+ new HiUniverse());	

	}
}


