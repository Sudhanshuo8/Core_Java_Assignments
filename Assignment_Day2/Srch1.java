import java.util.Scanner;
public class Srch1{

	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int temp=0;
		
		System.out.print("Enter the size of array : ");
		int size =sc.nextInt();
		
		
		
		int arr[] = new int[size];
		
		System.out.println("Enter element is given array is : ");
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
			
			
			
		}
		
		System.out.print("Enter the element to search : ");
		int s =sc.nextInt();
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==s) {
				temp=1;
				System.out.println(arr[i]+" element is found in array");
				break;
			}
			
		}
		if(temp==0) {
				System.out.println(s+" element is not found in array");
			
		}
		
	}

}