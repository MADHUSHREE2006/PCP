public class Symmetric {

	public static void main(String[] args) {
		int[][] a = {
				{1,2,3},
				{2,5,4},
				{3,4,9}
		};
		for(int i = 0; i<a.length;i++) {
			for(int j = 0; j <a[0].length; j++) {
				if(a[i][j] != a[j][i]) {
					System.out.println("Not Symmetric");
					return;
				}
			}
		}
		System.out.println("Symmentric");
	}
}
