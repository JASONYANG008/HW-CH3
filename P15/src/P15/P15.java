package P15;

public class P15 
{
	public static void main(String[] arg)
	{
		Car car1;
		car1= new Car();
		
		int number=1234;
		double gasoline=20.5;
		
		car1.setNumGas(number,gasoline);
	}
}

class Car
{
	int num;
	double gas;
	
	void setNumGas(int n,double g)
	{
		num=n;
		gas=g;
		System.out.println("܇̖�O��"+num+"�������O��"+gas);
	}
	void show()
	{
		System.out.println("܇̖��"+num);
		System.out.println("��������"+gas);
	}
}
