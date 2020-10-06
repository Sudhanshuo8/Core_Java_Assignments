import java.util.Scanner;
public class Words1{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name");
		String name = sc.nextLine();
		String[] str = name.split(" ");
		int a = str.length;
		System.out.println(a);
		for(String s1 : str)
		{
			System.out.println(s1);
		}
		
	}

}
