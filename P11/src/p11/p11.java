package p11;


public class p11 
{
	
	public static void main(String[] arg)
	{
		Car car1;
		car1 = new Car();
		
		car1.num=1234;
		car1.gas=20.5;
		
		car1.show();
		car1.show();
	}
}

class Car
{
	int num;
	double gas;
	
	void show()
	{
		System.out.println("܇̖��"+this.num);
		System.out.println("��������"+this.gas);
	}
}
