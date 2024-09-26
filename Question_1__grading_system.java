package Getting_Started;

import java.util.Scanner;

public class Question_1__grading_system {

	public static void main(String[] args) {
		/*for(int i=1;i<=5;i++) {
			System.out.println("h");
		}*/
		Scanner scn=new Scanner(System.in);
		int marks=scn.nextInt();
		if(marks>90) {
			System.out.println("excellent");
		}
		else if(marks>80) {
			System.out.println("good");
		}
		else if(marks>70){
			System.out.println("fair");	
		}
		else if(marks>60){
			System.out.println("meets expectations");
		}
		else {
			System.out.println("below par ");
		}

	}

}
