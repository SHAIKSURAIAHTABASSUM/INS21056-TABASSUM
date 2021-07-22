package lab3;

public class ResizeofArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] numArray= {23,78,6,87};
System.out.println("ARRAY before size:");
for(int i=0;i<numArray.length;i++) {
	System.out.println(numArray[i]);
}
int[] temp=new int[6];
int length=numArray.length;
for(int j=0;j<length;j++) {
	temp[j]=numArray[j];
}
	numArray=temp;
	System.out.println("ARRAY after resize");
	for (int i=0;i<numArray.length;i++)
System.out.println(numArray[i]);
}

	}


