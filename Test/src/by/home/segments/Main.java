package by.home.segments;
import java.util.Scanner;
public class Main {
	static void checkSegments(int ax1,int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2)
	{
		int c1,c2,c3,c4;
		
		   c1=(bx2-bx1)*(ay1-by1)-(by2-by1)*(ax1-bx1);
		   c2=(bx2-bx1)*(ay2-by1)-(by2-by1)*(ax2-bx1);
		   c3=(ax2-ax1)*(by1-ay1)-(ay2-ay1)*(bx1-ax1);
		   c4=(ax2-ax1)*(by2-ay1)-(ay2-ay1)*(bx2-ax1);
		
		   if  ((c1*c2<0) & (c3*c4<0)) {
			   System.out.println("Да,пересекаются");
		   }
		      else {   
		     System.out.println("Нет, не пересекаются");}
	}

	public static void main(String[] args) {
 	 int ax1 = 0,ay1 = 0,ax2 = 0,ay2 = 0,bx1 = 0,by1 = 0,bx2 = 0,by2 = 0;
	 Scanner sc = new Scanner(System.in);
	  System.out.println("Введите координаты первого отрезка: ");
	 ax1 = sc.nextInt();
	 ay1 = sc.nextInt();
	 ax2 = sc.nextInt();
	 ay2 = sc.nextInt();
	  System.out.println("Введите координаты первого отрезка: ");
	 bx1 = sc.nextInt();
	 by1 = sc.nextInt();
	 bx2 = sc.nextInt();
	 by2 = sc.nextInt();

	 checkSegments(ax1,ay1,ax2,ay2,bx1,by1,bx2,by2);
			}
			}

