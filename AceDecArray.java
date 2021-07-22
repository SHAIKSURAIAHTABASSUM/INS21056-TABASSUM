package lab3;

import java.util.Scanner;

public class AceDecArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++)
	arr[i]=sc.nextInt();
int countofSwap=0;
for(int i=0;i<n-1;i++) {
	countofSwap=0;
	for(int j=0;j<n-1-i;j++)
	{
		if(arr[j]>arr[j+1]) {
			int temp=arr[j];
			arr[j]=arr[j+1];
			arr[j+1]=temp;
			countofSwap++;
		}
	}
	if(countofSwap==0)
		break;
}
System.out.println("Accending order=");
for(int i=0;i<n;i++)
	System.out.println(arr[i]+" ");
for(int i=0,j=n-1;i<j;i++,j--) {
	int temp=arr[i];
	arr[i]=arr[j];
	arr[j]=temp;
}
System.out.println();
System.out.println("desccending order=");
for(int i=0;i<n;i++)
	System.out.println(arr[i]+" ");
	}

}
