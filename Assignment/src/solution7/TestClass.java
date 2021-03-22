package solution7;

public class TestClass {
	
	public static void main(String args[]) {
		TV t=new TV();
		Radio r= new Radio();
     	
		reset(r);
		System.out.println(r.getFrequency());
		System.out.println(r.getChannel());
	}

	public static void reset(Radio r) {
		
		r.setChannel(0);
		r.setFrequency(0.0);
	}

	
	

}
