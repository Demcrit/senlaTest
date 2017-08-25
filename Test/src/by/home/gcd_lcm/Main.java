package by.home.gcd_lcm;

import java.util.Scanner;

public class Main {
	
	private static int gcd(int a, int b) {
		if (b == 0) {
		return a;
		} else {
		return gcd(b, a % b);
		}
	}
		private static int lcm(int a, int b) {
			return a / gcd(a,b) * b;
			}
		
	public static void main(String[] args) {
		int a, b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Нахождение НОК и НОД чисел");
		System.out.println("Введите два числа");
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println("НОД " + gcd(a,b));
		System.out.println("НОК " + lcm(a,b));
		
		
	}
}
