public class MaxValue {
	
	public static void main(String[] args) {
		int[] a = {10,20,34,3,7,67,89};
		int max = a[0];
		for(int i = 1;i < a.length; i++) {
			if(a[i] > max){
				max = a[i];
			}
		}
		System.out.println(max);
	}
}
