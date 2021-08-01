package lab4;

public class Classobject {
Colour color;//instance variable
public static void main(String[] args) {
	Bottle blue=new Bottle(new Colour("blue color"));
			Bottle pink=new Bottle(new Colour("pink color"));
			System.out.println(blue.color.colorName);
			System.out.println(pink.color.colorName);

}
}
class Bottle{
	Colour color;
	public Bottle(Colour color) {
		this.color=color;
		
		
	}
	
}
class Colour{
	String colorName;
	public Colour(String colorName) {
		this.colorName=colorName;
	}
}