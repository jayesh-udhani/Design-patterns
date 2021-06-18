
public class Context {
	private ISort howDoISort;
	
	public Context(ISort howDoISort)
	{
		this.howDoISort=howDoISort;
	}
	
	public void sort(int[] numbers)
	{
		howDoISort.sort(numbers);
	}
	
	public void setHowDoISort(ISort howDoISort)
	{
		this.howDoISort=howDoISort;
	}
}
