package P26;

public class P26 
{
	public static void main(String[] arg)
	{
		Car car1;
		car1= new Car();
		car1.show();
	}
}
class Car {
	private int num;
	private double gas;
	
	public Car()
	{
		num=0;
		gas=0.0;
		System.out.println("�a����܇��");
	}
	
	public void show()
	{
		System.out.println("܇̖��"+num);
		System.out.println("��������"+gas);
	}
}
