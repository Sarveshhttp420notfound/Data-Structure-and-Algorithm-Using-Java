package DSA;

import java.util.Scanner;

public class Q_9_state_of_wakanda {
	public static Scanner scn=new Scanner(System.in);

	public static void main(String[] args) {
		int n=scn.nextInt(); //row
		int m=scn.nextInt(); //column
		
		int[][]arr=new int[n][m];
		
		input(arr);
		display(arr);
	

	}

	public static void input(int[][] arr) {
		// TODO Auto-generated method stub
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				arr[i][j]=scn.nextInt();
			}
		}
		
	}

	public static void display(int[][] arr) {
		// TODO Auto-generated method stub
		int n=arr.length;
		int m=arr[0].length;
		
		for(int j=0;j<m;j++) {
			if(j%2==0) {
				for(int i=0;i<n;i++) {
					System.out.println(arr[i][j]+" ");
				}
			}
			else {
				for(int i=arr.length-1;i>=0;i--) {
					System.out.println(arr[i][j]+" ");
				}
			}
		}
		
	}

}
