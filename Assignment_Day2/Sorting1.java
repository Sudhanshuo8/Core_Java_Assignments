import java.util.Scanner;
public class Sorting1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the size of array : ");
		int size =sc.nextInt();
		
		//Creation of array
		int arr[] = new int[size];
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
			
			
			
		}
		
		//sorting
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		System.out.println("Sorted array in descending order is : ");
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}

	}

}