import java.util.Scanner;
public class Series1 {

	public static void main(String[] args) {

	   Scanner sc = new Scanner(System.in);
	   System.out.print("Enter the last number : ");
	   int x =sc.nextInt();
	   int sum=0;

	   for(int i=0;i<=x;i++) {
		   sum = sum + (i*i);
	   }
	   System.out.println("Addition of series is : "+sum);
	}

}