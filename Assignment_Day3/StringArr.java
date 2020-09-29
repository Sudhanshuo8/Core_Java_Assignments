import java.util.Scanner;
public class StringArr {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String Arr[] = new String[4];
		
		System.out.println("Enter the String Array : ");

		for(int i=0;i<4;i++) {
			Arr[i]=sc.next();
		}
		
		System.out.println("Display the Array elements : ");
		for(String str : Arr)
			System.out.println(str);
		
		
	}

}