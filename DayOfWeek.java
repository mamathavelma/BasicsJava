import java.util.Scanner;
public class DayOfWeek{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("enter day:");
int day= sc.nextInt();
System.out.println("enter month:");
int month= sc.nextInt();
System.out.println("enter year:");
int year= sc.nextInt();

int y = year - (14 - month)/12;
int x = y + (y/4) - (y/100) + (y/400);
int m = month + 12 * ((14 - month) / 12) - 2;
int d0 = (day + x + (31 * m)/12)%7;

if (d0 == 0)
		System.out.println("The DayOfWeek is " + d0 + " and it is sunday");

	    else if (d0 == 1)
		System.out.println("The DayOfWeek is " + d0 + " and it is monday");

	    else if (d0 == 2)
		System.out.println("The DayOfWeek is " + d0 + " and it is tuesday");

	    else if (d0 == 4)
		System.out.println("The DayOfWeek is " + d0 + " and it is wednesday");

	    else if (d0 == 5)
		System.out.println("The DayOfWeek is " + d0 + " and it is thursday");

	    else if (d0 == 6)
		System.out.println("The DayOfWeek is " + d0 + " and it is friday");

	    else
		System.out.println("The DayOfWeek is " + d0 + " and it is Saturday");
	}
} 
