import java.util.Scanner;

public class CitireStringArray {
	public String[] Citire(int l) {
		Scanner myInput = new Scanner( System.in );
		String[] ans= new String[20];
		 int b=0;
		  System.out.print("Introduceti numele: ");
	     do {
	        b++;
	        ans[b] =  myInput.next();
	     }
	     while (b<l);
	     return(ans);
	}
      public void Print(String[] x, int c) {
		
		for(int i=1;i<=c;i++) {
			System.out.print(x[i]+ " ");
		}
		System.out.println();
	}

}
