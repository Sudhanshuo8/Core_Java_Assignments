import java.util.Scanner;
public class Table1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number that table u want : ");
		int x = sc.nextInt();
		
		for(int i=1;i<=10;i++) {
			int result = x*i;
			System.out.println(result);
		}

	}

}