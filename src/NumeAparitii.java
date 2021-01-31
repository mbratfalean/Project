
public class NumeAparitii {
	public void NumeAparitii(String[] x, int c){
	
		
		for (int i=1;i<=c;i++) {
			int count=1;
			if(x[i].equals("")) {
				continue;
			}else {
			
			for (int j=i+1;j<=c;j++) {
				if (x[i].equals(x[j])) {
					count++;
					x[j]="";
				}
			}
			System.out.println(x[i]+" apare de  "+count);
		
		}
			}
		
		
	}
		
	

}
