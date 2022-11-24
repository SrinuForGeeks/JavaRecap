// Access Specifiers 
// public > protected > default > private

class Sample
{
	private int count1 = 10;
	private static int count2 = 10;

	// Constructor 
	public Sample()
	{
		count1++;
		count2++;
	}


	public void getData()
	{
		System.out.println("\ncount1 = "+count1);// this.count1
		System.out.println("count2 = "+count2);
	}

}

public class MemoryDaigramEx
{
	public static void main(String[] args) {
		Sample s1 = new Sample();
		s1.getData();


		Sample s2 = new Sample();
		s2.getData();

	}
}

