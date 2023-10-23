package demoaccessModifiers;
class PrivateAccessModifier
{
	private void display()
	{
		System.out.println("Using private access modifiers");
	}
}

public class AccessModifiers1 {

	public static void main(String[] args) {
		System.out.println("Private access modifiers");
		PrivateAccessModifier obj= new PrivateAccessModifier();

	}

}
