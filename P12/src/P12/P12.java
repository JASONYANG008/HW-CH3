package P12;

public class P12 {

	public static void main(String[] arg)
	{
		Car car1;
		car1 = new Car();
		
		car1.num=1234;
		car1.gas=20.5;
		
		car1.showCar();
		
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
	void showCar()
	{
		System.out.println("�_ʼ�@ʾ܇���Y��");
		this.show();
	}
}
