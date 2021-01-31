
public class Maxim {
	public static int TheBigestNumber(int z, int y) {
		if (z>y) {
			System.out.println("Number"+" "+z+" "+"it's bigger than number"+" "+y);
			return(z);
		}
		else {
			if (z==y) {
				System.out.println("Numbers are equal");
				return(z);
			} else {
				System.out.println("Number"+" "+y+" "+"it's bigger than number"+" "+z);
				return(y);
			}
		}
	}


}
