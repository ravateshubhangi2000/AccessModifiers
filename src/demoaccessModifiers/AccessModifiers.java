package demoaccessModifiers;

class DemoAccessModifiers {
	void display()
	{
		System.out.println("Default AccessModifiers:");
	}
}
	public class AccessModifiers{
	public static void main(String[] args) {
		System.out.println("Default access Modifires:");
		DemoAccessModifiers obj= new DemoAccessModifiers();
		obj.display();

	}

}
