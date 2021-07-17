package lab;

import java.util.Scanner;

public class InputArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in=new Scanner(System.in);
int[] array=new int[10];
int sum=0;
System.out.println("enter the elements:");
for(int i=0;i<10;i++)
{
	array[i]=in.nextInt();
}
for(int num:array) {
	sum=sum+num;
}
System.out.println("sum of array elements is:"+sum);
	}

}
