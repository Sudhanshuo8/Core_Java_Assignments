import java.util.Scanner;
class Gender1{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the gender in m or f : ");
		char c = sc.next().charAt(0);
		
		if(c=='m'){
			System.out.println("Gender is : " +c);
			
			System.out.print("The age of Male is : ");
			int x = sc.nextInt();
			
			if(x>21){
				System.out.println("The person is eligible for marriage");
			}else{
				System.out.println("The person is not eligible for marriage");
			}
				
		}
		else{
			System.out.println("Gender is : " +c);
			
			System.out.print("The age of Female is : ");
			int x = sc.nextInt();
			
			if(x>18){
				System.out.println("The person is eligible for marriage");
			}else{
				System.out.println("The person is not eligible for marriage");
			}
		}
	}
}