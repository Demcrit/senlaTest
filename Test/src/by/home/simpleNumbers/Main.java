package by.home.simpleNumbers;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int num , arg;
		System.out.println("Простые числа в диапазоне от 1 до N");
		System.out.print("Введите N:");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		System.out.print(1 + " ");
			for(int i = 2; i <= num; i++) {
			for(arg = 2; (i % arg) > 0; arg++) {
	  		}
	  		if(arg == i) System.out.print(i + " ");
	  	}
			
	  }
}
