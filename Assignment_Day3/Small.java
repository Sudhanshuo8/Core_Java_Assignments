import java.util.Scanner;
public class Small {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int arr[]=new int[4];
		int max,min;
		
		System.out.print("Enter the element : ");
		for(int i=0;i<4;i++) 
			
		    arr[i]=sc.nextInt();
		    max=min=arr[0];
		
		
		for(int i=1;i<4;i++) {     ///for maximum number
			if(arr[i]>max) {
				max=arr[i];
			
			}
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		
		

		
		System.out.println("The Maximum number is : "+max);
		
		System.out.println("The Minimum number is : "+min);
		
		
		
		
		
		

	}

}