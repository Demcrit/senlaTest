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
    int num = a+b;
    while (num < n) {
     a = b;
     b = num;
     System.out.print(" " + num);
     num = a + b;
    }
}
}