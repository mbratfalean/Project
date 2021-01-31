
public class NumarAparitiiSpecific {
	public void NumeAparitiiSpecific(String[] x, int c,String t) {
		int count=0;
		 for (int p=1;p<c;p++) {
        	 if  (x[p].equals(t)) {
        		 count++;
        	 }
         }
		 if(count>0) {
         System.out.println("Numele "+t+" s-a citit de  "+count+" ori");
         }else {
        	 System.out.println(t+" nu a fost introdus");
         }
	}

}

	
