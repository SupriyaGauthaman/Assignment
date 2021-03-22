package solution2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class StringToArrayList {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the no of names");
		int count=sc.nextInt();
		String[] names = new String[count];
		System.out.println("Enter the names:");
		for(int i=0;i<count;i++) {
			 names[i]=sc.next();
		}
		
		
		System.out.println("Array of String converted to Arraylist:"+getArrayList(names));
     }

	private static  ArrayList<String> getArrayList(String[] names) {
		
		ArrayList<String> arrayList=new ArrayList<String>(Arrays.asList(names));
		return arrayList;
	}

}
