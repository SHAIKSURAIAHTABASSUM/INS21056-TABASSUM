package lab4;

public class ClassobjectDemo {

	public static void main(String[] args) {
Stove onida=new Stove();
Gas LPG=new Gas();
Vessel vessel=new Vessel();
Utensils utensils=new Utensils();

Biryani.preparing(onida, LPG, vessel, utensils);
Rice basmati=new Rice();
Water mineral=new Water();
Meat mutton=new Meat();
Ingredients Grofers=new Ingredients();

Biryani FamilyBiryani=new Biryani(basmati,mineral,mutton,Grofers);
FamilyBiryani.makebiryani();

System.out.println("..........................................");
	}

}
class Biryani{
	static Stove stove;
	static Gas gas;
	static Vessel vessel;
	static Utensils utensils;
	//object needs
	Rice rice;
	Meat meat;
	Water water;
	Ingredients ingredients;
	public static void preparing(Stove stove,Gas gas,Vessel vessel,Utensils utensils) {
		Biryani.stove=stove;
		Biryani.gas=gas;
		Biryani.vessel=vessel;
		Biryani.utensils=utensils;
	}
	public Biryani(Rice rice,Water water,Meat meat,Ingredients ingredients) {
		this.rice=rice;
		this.water=water;
		this.meat=meat;
		this.ingredients=ingredients;
	}
	
	public void makebiryani() {
		System.out.println("I use.."+Biryani.stove);
		System.out.println("I use.."+Biryani.gas);
		System.out.println("I use.."+Biryani.vessel);
		System.out.println("I use.."+Biryani.utensils);
		
		System.out.println("My biryani has"+this.rice);
		System.out.println("My biryani has"+this.meat);
		System.out.println("My biryani has"+this.water);
		System.out.println("My biryani has"+this.ingredients);
	
		System.out.println("My biryani ready");
	}
}
//infrastructural requirements
class Stove{}
class Gas{}
class Vessel{}
class Utensils{}
//object requirements
class Rice{}
class Water{}
class Meat{}
class Ingredients{}
