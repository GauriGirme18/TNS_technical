package Day6;

final class FinalClass
{
	void show()
	{
		System.out.println("Final class cannot be inherited");
	}
}

//we cannot create child class from final class ,E.g String,wrapper class

public class FinalMethodMain {

	public static void main(String[] args) {
		FinalClass f=new FinalClass();
		f.show();

	}

}
