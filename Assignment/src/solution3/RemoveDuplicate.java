package solution3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class RemoveDuplicate {

	public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the no of names");
		int count=sc.nextInt();
		String[] names = new String[count];
		System.out.println("Enter the names:");
		for(int i=0;i<count;i++) {
			 names[i]=sc.next();
		}
		ArrayList<String> list=getArrayList(names);
		
		
		System.out.println("After duplicate items are removed:"+removeDuplicatedItems(list));

	}
   private static  ArrayList<String> getArrayList(String[] names) {
		
		ArrayList<String> arrayList=new ArrayList<String>(Arrays.asList(names));
		return arrayList;
	}

	private static ArrayList<String> removeDuplicatedItems(ArrayList<String> list) {
		ArrayList<String> newList=new ArrayList<String>();
		for (String element : list) { 
			 if (!newList.contains(element)) {
            	newList.add(element); 
            } 
        } 
		return newList;
	}

}
