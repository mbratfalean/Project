
public class TwoArrays {
	public void Afisare(int[] x,int b) {
		 int[] np = new int[100];
		 int[] nn= new int[100];
		 int t=0;
		 int y=0;
		  
		
		 
		 for(int i=0; i<=b;i++) {
			if(x[i]>=0) {
				np[t]=x[i];
				t++;
			} else {
				nn[y]=x[i];
				y++;
			}
		}
		 PrintArray array = new PrintArray();
		 
		array.Print(np,t-1);
	    array.Print(nn,y-1);
	    System.out.println("Afisare alternativa");
	    if (t>=y) {
		       for (int o=0;o<t;o++) {
		    	   System.out.print(np[o]+" ");
		    	   if (o<y) {
		    	   System.out.print(nn[o]+" ");
		    	   }
		    	   }
		    	   
		       
		       }else {
		    	   for (int p=0;p<y;p++) {
		    		   System.out.print(nn[p]+" ");
		    		   if(p<t) {
		    			System.out.print(np[p]+" ");
		    	    	   }
		    	   }
	    
		}
		
	}
}


