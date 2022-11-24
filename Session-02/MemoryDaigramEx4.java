
class Sample
{
	

	 static // static block, executes at the time class loading...
	 {
	 	System.out.println("Static Block");
	 	
	 }
	
	public  Sample()
	{
		System.out.println("Constructor Block");

	}

}

public class MemoryDaigramEx4
{
	public static void main(String[] args) {

		new Sample();
		
		new Sample();

		new Sample();

	}
}

