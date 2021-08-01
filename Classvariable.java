
public class Classvariable {




	public static void main(String[] args) {
		// TODO Auto-generated method stub
Home furniture=new Home();
furniture.hall="big sofa";
furniture.kitchen="fridge";
Home cupboard=new Home();
cupboard.hall="5";
cupboard.kitchen="6";

System.out.println(furniture.hall+":"+furniture.kitchen);
System.out.println(cupboard.hall+":"+cupboard.kitchen);
	}

}

class Home{
	String hall;
	 String kitchen;
	
}
