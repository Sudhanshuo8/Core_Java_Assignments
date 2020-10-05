import java.util.Scanner;
abstract class Processor{
	int data;
	abstract void process(int data);
	void show() {
		System.out.println("data = "+data);
	}
}

class Factorial extends Processor{

	@Override
	void process(int data) {
		int d=data;
		int f=1;
		while(data>=1)
		{
			f=f*data;
			data=data-1;
		}
		System.out.println("Factorial of "+d+" is = "+f);
	}
	
}

class Circle extends Processor{

	@Override
	void process(int data) {
		double area;
		area = (3.14 * data *data);
		System.out.println("Area of circle is = "+area);
	}
	
}
class ProssDemo {

	public static void main(String[] args) {	
	Scanner sc = new Scanner(System.in);
	int data;
	Processor f = new Factorial();
	Processor c = new Circle();
	System.out.println("Enter your choice : ");
	System.out.println("For Factorial enter 1");
	System.out.println("For area of circle enter 2");
	int choice = sc.nextInt();
	switch(choice)
		{
			case 1 : 
					System.out.println("Enter the number : ");
					data = sc.nextInt();
					f.show();
					f.process(data);
					break;
			
			case 2 : 
					System.out.println("Enter the number : ");
					data = sc.nextInt();
					c.show();
					c.process(data);
					break;
			default : 
					System.out.println("Invalid Input");
				
		}
	}

}