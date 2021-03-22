package solution10;

import java.util.Scanner;

public class LambdaImpl2{
  

	public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	
    	System.out.println("No of parameters");
    	int n=sc.nextInt();
    	double[] params =new double[n];
    	System.out.println("Enter the parameters");
    	
    	for(int i=0;i<n;i++) {
    		
			params[i]=sc.nextDouble();
    	}
    	Shape s=()->params[0]*params[1];
		Operation op=(name,param)->{
//			System.out.println("Name is:"+name);
//			System.out.println("Parameters are:");
			for(int i=0;i<param.length;i++)
				System.out.println(param[i]);
		};
		op.operate("Rectangle",params);
		
		System.out.println("Area is:"+s.computeArea());
	}

	
}



