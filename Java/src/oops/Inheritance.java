package oops;


class sample{
	int a=10;
}
class demo extends sample{
	// a virtually present
	void add()
	{
		System.out.println("hello");
	}
}

public class Inheritance {

	public static void main(String[] args) {
		demo d1=new demo();
		System.out.println(d1.a);
		d1.add();

	}

}
