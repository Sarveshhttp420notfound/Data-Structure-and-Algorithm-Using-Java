package DSA;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q_3_Reverse_an_array {
	
	public static void main(String[] args) throws Exception {
		  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		    int n = Integer.parseInt(br.readLine());
		    int[] a = new int[n];
		    for(int i = 0; i < n; i++){
		       a[i] = Integer.parseInt(br.readLine());
		    }

		    reverse(a);
		    display(a);

	}
	public static void display(int[] a){
	    StringBuilder sb = new StringBuilder();

	    for(int val: a){
	      sb.append(val + " ");
	    }
	    System.out.println(sb);
	  }
	  public static void swap(int [] a, int i, int j){
	       int temp = a[i];
	       a[i] = a[j];
	       a[j] =  temp;
	       
	  }

	  public static void reverse(int[] a){
	    int i = 0;
	    int j = a.length-1;
	    while(i <= j){
	        swap(a, i,j);
	        i++;
	        j--;
	    }
	  }



}
/*  
 *public static void reverse(int[]a){
 *int i=0;
 *int j=a.length-1;
 *while(i<=j){
 *swap(a,i,j);
 *i++;
 *j--;
 *
 *}
 *}
 *
 *public static void swap(int[]a,int i,int j){
 *int temp=a[i];
 *a[i]=a[j];
 *a[j]=temp;
 *}
 * 
 * 
 * */

