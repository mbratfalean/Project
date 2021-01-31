
public class Sortare {
	public void Sortare(int[] x, int c) {
		int[] na = new int[100];
		int t=0;
		 for(int z = 0; z<=c; z++) {
	           int min = x[z];
	           int v=0;
		       for(int i = z+1; i<=c; i++) {
	               if(x[i]<min) {
	               min = x[i];
	               v=i; 
	                           }
		       }
	           int tempb=x[z];
	           x[z]=min;
	           x[v]=tempb;
		       na[t]=min;
		       t++;
		       }
		       

		     for (int j=0;j<=c ;j++) {
		    	   System.out.print(na[j]+" ");
		       }
	}

}
