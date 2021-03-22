package solution4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Switching {
	
	public static ArrayList<String> switchIt(ArrayList<String> aOne,int a,int b)
	{
		Collections.swap(aOne, a, b); 
		return aOne;
		
	}
	 public static void main(String a[]) 
	    { 
	  
	        // Create the Array List 
	        ArrayList<String> name = new ArrayList<String>(); 
	  
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the no of items");
	        int length=sc.nextInt();
	        for(int i=1;i<=length;i++) {
	            System.out.println("Please enter your name: ");
	            name.add(sc.next());
	        }
	        System.out.println("Before Swapping:"+name);
	        System.out.println("After swapping:"+switchIt(name,1,2));
	      sc.close();
	       
	    } 
}
