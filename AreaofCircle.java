package lab;

import java.util.Scanner;

public class AreaofCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter the radius:");
double radius=sc.nextDouble();
double area=Math.PI*(radius*radius);
System.out.println("the area of circle is:"+area);
double circumference=Math.PI*2*radius;
System.out.println("the circumference of a circle"+circumference);

	}

}
