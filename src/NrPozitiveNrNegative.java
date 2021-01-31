
public class NrPozitiveNrNegative {
	
	
	public static int[] NumerePozitiveWhile(int x) {
		int y;
		y=0;
		
		int v;
		
		
		int[] ans = new int[2];
				ans[0]=0;
				ans[1]=0;
		while (y<x) {
			v=GetNumbers.GetNumbers();
			ans[1]=ans[1]+v;
			if ((v>=0)||(v==-0)) {
				ans[0]++;
				y++;
			}else
				y++;
		}
		return(ans);
		
	} 
	public static int[] NumerePozitiveDoWhile (int x) {
		int y;
		y=0;
		
		int v;
		
		int[] ans = new int[2];
		ans[0]=0;
		ans[1]=0;
		do {
			v=GetNumbers.GetNumbers();
			ans[1]=ans[1]+v;
			if ((v>=0)||(v==-0)) {
				ans[0]++;
				y++;
			}else
				y++;
		}while (y<x);
			return(ans);
		}
	

}


