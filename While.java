package lab;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num,sum=0;
Scanner sc=new Scanner(System.in);
System.out.println("enter any integer below 10");
num=sc.nextInt();
while(num<=10) {
	sum=sum+num;
	num++;
}
System.out.format("sum of the numbers from the loop is:%d",sum);
	}

}
