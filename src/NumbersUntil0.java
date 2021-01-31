
public class NumbersUntil0 {
public static int StopWhile() {
		
		int v;
		int z;
		z=0;
		boolean  assumption;
		assumption=true;
		
		while (assumption==true) {
	     v=GetNumbers.GetNumbers();
	     z++;
	     
	     if (v==0) {
	    	 assumption=false;
	    	 System.out.println("Game over");
	    	 break;
	      }
		}
		return(z);
	 }
	
	public static int StopDoWhile () {
		int v;
		int z;
		z=0;
		boolean assumption;
		assumption=true;
		
		do {
			v=GetNumbers.GetNumbers();
			z++;
			if (v==0) {
				assumption=false;
				System.out.println("Game over");
				break;
			}
			
		 }
		while (assumption==true);
		System.out.println("Sad");
		return(z);
		
	}

}
