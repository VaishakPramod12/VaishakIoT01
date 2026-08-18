
public class grandparents 
{
	void bp()
	{
		System.out.println(" understain   bp");
	}
}
class Parent extends grandparents
{
	void cancer()
	{
		System.out.println(" understain");
	}
	
}

public class Demo extends Parent{

	public static void main(String[] args) {
 		Demo  bb= new Demo();
 		bb.bp();
 		bb.cancer();
	}
}
