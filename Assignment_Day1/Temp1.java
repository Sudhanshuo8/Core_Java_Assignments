import java.util.Scanner;

class Temp1{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
	    System.out.print("Enter the temperature in Ferhenhit  : ");
		float f = sc.nextFloat();
		float c = 5*(f-32)/9 ;
		System.out.print("The Tempearture in Celcius  is : "+c+" oC");
	}
}
		