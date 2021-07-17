package lab;

import java.util.Scanner;

public class Floydtriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int rows,num=1,count,j;
Scanner input=new Scanner(System.in);
System.out.println("enter number of rows for floyd triangle:");
rows=input.nextInt();
System.out.println("floyds triangle");
System.out.println("**************");
for(count=1;count<=rows;count++) {
	for(j=1;j<count;j++)
		System.out.println(num+" ");
	num++;
		}
System.out.println();
	}

}
