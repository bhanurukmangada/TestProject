package oops;
//Encapsulation
class gmail
{
	private String password="bhanu";
	
	public String getpassword()
	{
		return password;
		
	}
	public void setpassword(String password)
	{
		this.password=password;
	}
}

public class Demo2 {

	public static void main(String[] args) {
		gmail g1=new gmail();
		System.out.println(g1.getpassword());
		g1.setpassword("bhanu");
		System.out.println(g1.getpassword());
		
		// TODO Auto-generated method stub

	}

}
