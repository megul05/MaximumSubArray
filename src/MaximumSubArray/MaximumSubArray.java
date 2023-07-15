package MaximumSubArray;

import java.util.*;

public class MaximumSubArray {
	
	  public static int findMaxSub(int[] arr,int size,int m) {
	        int sum = 0;
	        int result = 0;
	        for(int i=0;i<size;i++) {
	            sum = 0;
	            for(int j=0;j<size;j++)
	            {
	                if(sum+arr[j] <= m) 
	                {
	                    sum += arr[i];
	                }
	            }
	            if(result<sum)
	            {
	                result = sum;
	            }
	        }
	        return result;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Size of the Array :");
		int size = scan.nextInt();
		System.out.println("Enter elements of the Array :");
	        int[] arr = new int[size];
	        for(int i=0;i<size;i++) {
	            arr[i] = scan.nextInt();
	        }
	        int m = scan.nextInt();
	        System.out.println(findMaxSub(arr, size, m));

	}

}
