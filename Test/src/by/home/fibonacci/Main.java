package by.home.fibonacci;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	int n = 0;
	System.out.println("����� ��������� � ��������� �� 1 �� N");
	System.out.print("������� N:");
	Scanner sc = new Scanner(System.in);
	n = sc.nextInt();
	int a = 1, b = 1;
    System.out.print(a + " " + b);
    int num = 2, i = 2;
    while (num >= n) {
        num = a + b;
        a = b;
        b = num;
        System.out.print(" " + num);
        i++;
    }
}
}