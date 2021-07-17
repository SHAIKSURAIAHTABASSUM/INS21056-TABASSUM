package lab;

import java.util.Scanner;

public class AreaofRec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner=new Scanner(System.in);
System.out.println("enter the length of Rectangle:");
double length=scanner.nextDouble();
System.out.println("enter the width if Rectangle:");
double width=scanner.nextDouble();
double area=length*width;
System.out.println("Area of Rectangle:"+area);
	}

}
