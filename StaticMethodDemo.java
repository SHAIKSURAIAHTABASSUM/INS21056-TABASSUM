
	
	public class StaticMethodDemo {
		public static void main(String[] args) {
			
			StaticDemo.metStatic(10000);
			//To access non static methods-you need to create an object of StaticDemo
	
			
			
		}
	}
	class StaticDemo{
		static int money;
		public void metNormal() {
			System.out.println("normal method called...."+money);
		}
		//Static Methods are written to provide common logic for all the instances of
		//this class
		public static void metStatic(int money) {
			//static methods can only access static variables or methods
			StaticDemo.money=money;//you cannot use this keyword in static context....
			System.out.println("static method called....");
		}
	}

