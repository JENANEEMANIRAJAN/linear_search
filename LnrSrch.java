package linearsrch;

import java.util.Scanner;

public class LnrSrch {
	public static int LnrSrch(int arr[],int a) {
		int size = arr.length;
		int count = 0;
		for(int i = 0; i<size; i++) {
			int b = 0;
			if(arr[i] == b) {
				count++;
			}
			else {
				count = 0;
			}
		}
	return count;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		int b = sc.nextInt();
		int value = LnrSrch(arr, b);
		char[] val = null;
		System.out.println(val);
		
	}

}
