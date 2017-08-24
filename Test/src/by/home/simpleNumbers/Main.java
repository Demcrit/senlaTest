package by.home.simpleNumbers;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int num , arg;
		System.out.println("¬ведите конечное число");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		System.out.print(1 + " ");
			for(int i = 1; i <= num; i++) {
			for(arg = 2; (i % arg) > 0; arg++) {
	  		}
	  		if(arg == i) System.out.print(i + " ");
	  	}
			
	  }
}
