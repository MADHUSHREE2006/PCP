import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number of data:");
        int n=s.nextInt();
        int[] arr= new int[n];
        for(int i = 0; i<n ; i++){
            int num = s.nextInt();
            arr[i] = num; 
        }
        int sum = 0;
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
            if(i>=40 && i<=100){
                sum=sum+arr[i];
            }
        }
        System.out.println(sum);
       
    }
}
