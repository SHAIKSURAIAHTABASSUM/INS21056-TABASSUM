package lab;

import java.util.Scanner;

public class Square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("enter side of square:");
Scanner scanner=new Scanner(System.in);
double side=scanner.nextDouble();
double area=side*side;
System.out.println("Area of square is:"+area);
	}

}
