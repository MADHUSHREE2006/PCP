import java.util.Arrays;

public class SpiralTraversalMatrix {

	public static void main(String[] args) {
		int [][]a = {
				{1,2,3,4,5,6},
				{7,8,9,10,11,12},
				{13,14,15,16,17,18},
				{19,20,21,22,23,24},
				{25,26,27,28,29,30},
				{31,32,33,34,35,36}
		};
		System.out.println(Arrays.deepToString(a));
		int col = a[0].length, row = a.length;
		int left = 0, top = 0, right = col-1, bottom = row-1;
		while(left<=right && top<=bottom) {
			for(int i = left; i<=right;i++){
				System.out.print(a[top][i]+ " ");
			}
			top++;
			for(int i = top; i<=bottom;i++){
				System.out.print(a[i][right]+" ");
			}
			right--;
			for(int i = right; i>=left;i--){
				System.out.print(a[bottom][i]+" ");
			}
			bottom--;
			for(int i = bottom; i>=top;i--){
				System.out.print(a[i][left]+" ");
			}
			left++;
		}

	}

}
