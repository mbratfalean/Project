
public class NonDuplicates {
	public void NonDuplicates(int[] x, int c) {
	       for (int i = 0; i <=c; i++)
	       {  
	       boolean    assumption=true;
	           for (int j = i + 1; j <=c; j++)
	           {
	               if (x[i] == x[j])
	               {
	                   assumption=false;
	               }
	           }

	           if (assumption==true)
	           {
	               System.out.print(x[i]+" ");
	           }
	       
	}

}
}
