
class Sample
{
	private static int number;

	 static // static block, executes at the time class loading
	 {
	 	System.out.println("static block");
	 	number = 15;
	 }
	
	public static void getData()
	{
		System.out.println("\n number = "+number);

	}

}

public class MemoryDaigramEx3
{
	public static void main(String[] args) {
		Sample.getData();

	}
}

