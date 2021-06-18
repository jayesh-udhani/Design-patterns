
public class MergeSort implements ISort {

	@Override
	public void sort(int[] input) {
		// TODO Auto-generated method stub
		sortUtil(input,0,input.length-1);
	}

	private void sortUtil(int[] input, int l, int h) {
		if(l>=h)
			return;
		int m = l+(h-l)/2;
		sortUtil(input,l,m);
		sortUtil(input, m+1, h);
		merge(input,l,m,h);	
	}

	private void merge(int[] input, int l, int m, int h) {
		int i,j,k;
		int[] left,right;
		left=new int[m-l+1];
		right=new int[h-m];
		for(i=l;i<=m;i++)
			left[i-l]=input[i];
		for(i=m+1;i<=h;i++)
			right[i-m-1]=input[i];
		i=0;
		j=0;
		k=l;
		while(i<left.length && j<right.length)
		{
			if(left[i]<=right[j])
				input[k++]=left[i++];
			else
				input[k++]=right[j++];
		}
		while(i<left.length)
			input[k++]=left[i++];
		while(j<right.length)
			input[k++]=right[j++];
	}

}
