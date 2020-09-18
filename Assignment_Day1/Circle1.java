//06.	Write a program that takes radius of a circle as input. Read the entered radius using Scanner class. Then calculate and print the area and circumference of the circle.
import java.util.Scanner;
public class Circle1{
public static void main(String args[]){
	float pi=3.14f;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the radius");
int r=sc.nextInt();
float rad=pi*r*r;
float circum=2*pi*r;
System.out.println("Radius is "+rad);
System.out.println("Circumference is "+circum);


}
}