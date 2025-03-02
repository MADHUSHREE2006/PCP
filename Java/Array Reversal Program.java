import java.util.Arrays;

public class Sorting {

	public static void main(String[] args) {
		int[] a = {10,20,34,3,7,67,89};
		int temp=0,i,j;
		for(i=0,j=(a.length-1);i<j;i++,j--)
		{
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
		System.out.println("Array elements are:"+Arrays.toString(a));
	}
}
