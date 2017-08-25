package by.home.palindrome;
import java.util.Scanner;
public class Main {
	
	 public static boolean palindrome(String s) {
	        return s.equals((new StringBuilder(s)).reverse().toString());
	    }


	public static void main(String[] args) {
		String s = null;
		System.out.println("Введите слово для проверки");
		Scanner sc = new Scanner(System.in);
		s = sc.nextLine();
        if (palindrome(s)==true) System.out.println("Введенное слово является палиндромом");
        else System.out.println("Введенное слово не является палиндромом");
	}

}
