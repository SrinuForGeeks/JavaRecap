
class Sample
{
	private int count;

	public void setCount(int count)
	{
		this.count = count;
	}


	public void getData()
	{
		System.out.println("\ncount = "+count);// this.count
	}

}

public class MemoryDaigramEx2
{
	public static void main(String[] args) {
		Sample s = new Sample();
		s.setCount(15);
		s.getData();

	}
}

