import java.util.Scanner;

/*1. Se citesc numere intregi pana la intalnirea lui zero.
a. Sa se formeze un array cu numerele pozitive si unul cu numerele negative. Apoi sa se afiseze alternativ elemente din fiecare array.
b. Sa se afiseze numerele citite in ordinea inversa citirii lor.
c. Sa se afiseze toate numere citite, insa o singura data (fara duplicate).
*Numerele citite in ordine crescatoare.

2. Se citesc numele a n persoane. Sa se afiseze:
a. Perechi de forma nume – numar aparitii.
b. Daca s-a citit sau nu numele “Popescu”. Daca s-a citit, afisati si de cate ori s-a citit.*/

public class Tema2Metode {

	public static void main(String[] args) {
	
		 CitireArrayint x=new CitireArrayint();
		 int[] ans=x.Citire();
		 LenghtArray v=new LenghtArray();
		 int b=v.Lenght(ans);
		 TwoArrays array2 = new TwoArrays();
		 array2.Afisare(ans, b);    
		 System.out.println();
		 System.out.println("Afisare inversa");
		 PrintArray array = new PrintArray();
		 array.Descending(ans, b);
		 System.out.println("Afisare fara duplicate");
		 NonDuplicates array3= new NonDuplicates();
		 array3.NonDuplicates(ans, b);
		 System.out.println();
		 System.out.println("Sortare");
		 Sortare array4=new Sortare();
		 array4.Sortare(ans, b);
		 System.out.println();
		 System.out.println("Urmeaza problemele cu array de string ");
		 System.out.println(" lungimea sirului");
		 int l=GetNumbers.GetNumbers();
		 CitireStringArray array5= new CitireStringArray();
		 String[] array6=array5.Citire(l);
		 array5.Print(array6, l);
		 NumeAparitii array7=new NumeAparitii();
		 array7.NumeAparitii(array6, l);
		 Scanner myInput = new Scanner( System.in );
		 System.out.println(" Introduceti numele cautat");
		 String nume= new String(myInput.next());
		 NumarAparitiiSpecific array8=new NumarAparitiiSpecific();
		 array8.NumeAparitiiSpecific(array6, l, nume);
		 
	}
}
