
public class Variabledemo {
	int i=30;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Variabledemo obj=new Variabledemo();
obj.met();
}
public void met() {
	int i=6666;
	System.out.println(i);
	System.out.println(this.i);
}
}
