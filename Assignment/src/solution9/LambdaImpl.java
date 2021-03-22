package solution9;
import java.util.Scanner;

public class LambdaImpl {
	public static void main(String[] args) {
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter number");
			int n=sc.nextInt();
			WithoutParameter np=()->n%2==0;
			if(np.evenOdd())
			System.out.println("Lambda expression ()->boolean returns:"+n+" is even");
			else
				System.out.println("Lambda expression ()->boolean returns:"+n+" is odd");
			
			Comparison cmp=p->p<98;
			System.out.print("Lambda Expression p->p<98 returns:");
			System.out.println(n+" < 98 is :"+cmp.compare(n));
			
			sc.close();

		}
       
	}

	interface WithoutParameter{
		boolean evenOdd();
	}

	interface Comparison{
		boolean compare(int p);
	}



