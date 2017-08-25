package by.home.numbersKick;
import java.util.Scanner;
public class Main {
	private static String delNumbers (String s) {
		String n = "0123456789";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
        	if (!n.contains(String.valueOf(s.charAt(i))))
                sb.append(s.charAt(i));
        }
        return sb.toString();
    }

	public static void main(String[] args) {
		String s = null;
		System.out.println("Введите текст");
        Scanner sc = new Scanner(System.in);
        s = sc.nextLine();
        System.out.println("Новая строка: "+delNumbers(s));
	}

}
