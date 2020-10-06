import java.util.Scanner;
public class Convert1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name");
		String name = sc.nextLine();
		String[] str = name.split(" ");
		
		for(String s1 : str)
		{
			
			int a = s1.charAt(0);
			//System.out.println(a);
			if(a>96)
			{
				a=a-32;
				char c = (char)a;
				s1=c+s1.substring(1);
			}
			System.out.print(s1+" ");
		}

	}

}