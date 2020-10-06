package IOPrackage;

import java.io.*;
public class Read1 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
	  FileInputStream file1=new FileInputStream("E:\\core java\\dir\\Shopping.dat");
     //  Read11 shop =new Read1("Cloath",2000,2);
       ObjectInputStream obj1=new ObjectInputStream(file1);
  
        Read1 shop=(Read1)obj1.readObject();
        System.out.println(shop);
        
       obj1.close();
       System.out.println("Successfully read Data from Shopping.dat file");
       file1.close();
	}

}