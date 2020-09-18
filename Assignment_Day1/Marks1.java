/*Write a program to calculate sum of 5 subject’s marks & find percentage. Take the obtained marks from user using Scanner class. Output should be in this format [ percentage marks = 99 % ].
 Use concatenation operator here.*/
import java.util.Scanner;
public class Marks1{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the marks ");
int m1=sc.nextInt();
int m2=sc.nextInt();
int m3=sc.nextInt();
int m4=sc.nextInt();
int m5=sc.nextInt();

float total=m1+m2+m3+m4+m5;
System.out.println("total marks = "+total);
float per= (total/ 500) * 100;
	    
System.out.println("percentage marks = "+per+"%");



}
}