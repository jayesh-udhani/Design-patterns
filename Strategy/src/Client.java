import java.util.*;

public class Client {
	public static void print(int[] a)
	{
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int n,i;
		n=in.nextInt();
		int[] a=new int[n];
		for(i=0;i<n;i++)
			a[i]=in.nextInt();
		
		Context context = new Context(new QuickSort());
		context.sort(a);
		print(a);
		in.close();
	}

}
