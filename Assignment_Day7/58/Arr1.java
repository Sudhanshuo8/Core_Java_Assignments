import java.util.Scanner;



public class Arr1 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String str[] = {"Sunday","Monday","Tuesday","Wednesday","Thusday","Firday","Saturday"};
	System.out.println("Enter day position: ");
	int day = sc.nextInt();	
	try {
		System.out.println("The day is : "+str[day]);
	}catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("please.....enter Valid Value");
	}
	}
}