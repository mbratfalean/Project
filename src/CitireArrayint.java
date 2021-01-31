
public class CitireArrayint {
	public int[] Citire() {
		 int[] ans= new int[20];
		 int b=-1;
		 
		 System.out.print("Introduceti numerele: ");
	     do {
	        b++;
	        ans[b] = GetNumbers.GetNumbers();
	     }
	     while (ans[b] != 0);
	     return(ans);
	}
}
