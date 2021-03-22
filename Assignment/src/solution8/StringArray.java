package solution8;



public class StringArray {
	public static void main(String[] args) {
		String[][] names=new String[2][3];
		names[0][0]="AAA";
    	names[0][1]="BBB";
		names[0][2]="CCC";

		names[1][0]="EEE";
		names[1][1]="FFF";
		names[1][2]="GGG";

			System.out.println("Without Loops");
			System.out.println(names[0][0]);
			System.out.println(names[0][1]);
			System.out.println(names[0][2]);

			System.out.println(names[1][0]);
			System.out.println(names[1][1]);
			System.out.println(names[1][2]);

		
        System.out.println("With loops");
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				
				
				System.out.println(+i+" "+j+":"+names[i][j]);
			}
		}
		
		
		
	}

}
