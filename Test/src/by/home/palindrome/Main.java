package by.home.palindrome;
import java.util.Scanner;
public class Main {
	
	 public static boolean palindrome(String s) {
	        return s.equals((new StringBuilder(s)).reverse().toString());
	    }


	public static void main(String[] args) {
		String s = null;
		System.out.println("¬ведите слово дл€ проверки");
		Scanner sc = new Scanner(System.in);
		s = sc.nextLine();
        if (palindrome(s)==true) System.out.println("¬веденное слово €вл€етс€ палиндромом");
        else System.out.println("¬веденное слово не €вл€етс€ палиндромом");
	}

}
