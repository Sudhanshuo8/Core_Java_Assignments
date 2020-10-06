public class Sum1 {

	public static void main(String[] args) {
		String s1 ="67, 89, 23, 67, 12, 55, 66";
		String [] str = s1.split(", ");
		int a[]=new int[str.length];
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			a[i] = Integer.parseInt(str[i]);
			sum=sum+a[i];
		}
		System.out.println("Sum = "+sum);

	}

}
