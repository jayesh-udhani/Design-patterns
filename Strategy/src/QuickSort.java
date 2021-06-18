
public class QuickSort implements ISort {

	@Override
	public void sort(int[] input) {
		// TODO Auto-generated method stub
		sortUtil(input,0,input.length-1);
	}

	private void sortUtil(int[] input, int l, int h) {
		if(l>=h)
			return;
		int pivot = partition(input,l,h);
		sortUtil(input,l,pivot-1);
		sortUtil(input, pivot+1, h);
	}

	private int partition(int[] input, int l, int h) {
		int pivot = h,i = l,j,t;
		for(j=l;j<h;j++)
		{
			if(input[j]<input[pivot])
			{
				t=input[i];
				input[i]=input[j];
				input[j]=t;
				i++;
			}
		}
		t=input[i];
		input[i]=input[pivot];
		input[pivot]=t;
		return i;
	}
}
