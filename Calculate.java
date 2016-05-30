public class Calculate {
	public static void main(String[] arg) {
		System.out.println("Calculate... ");
		int first = Integer.valueOf(arg[0]);
		int second = Integer.valueOf(arg[1]);
		int third = Integer.valueOf(arg[2]);
		int fourth = Integer.valueOf(arg[3]);
		int summ = first + second;
		System.out.println ("Summ" + summ);
			int diff = third - fourth;
			System.out.println ("Diff3-4=" + diff);
				int mult = first * third;
				System.out.println ("Mult1*3=" + mult);	
					int div = third / fourth;
					System.out.println ("Div3/4=" + div);
                                        	
              }

}