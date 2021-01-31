/*2. Se citesc doua numere intregi din consola. Sa se afiseze maximul dintre ele.
3. Se citesc doua numere intregi din consola. Sa se afiseze catul si restul impartirii celui mai mare la cel mai mic.
4. Se citesc doua numere intregi din consola. Sa se afiseze care este/sunt pozitiv(e) si care este/sunt negativ(e).
5. Se citeste un numar natural in variabila “n” si apoi se citesc n numere intregi din consola. Sa se afiseze cate numere citite sunt pozitive [2 rezolvari – cu while si cu do while].
6. Se citeste un numar natural in variabila “n” si apoi se citesc n numere intregi din consola. Sa se afiseze suma numerelor citite [2 rezolvari – cu while si cu do while].
7. Se citesc din consola numere intregi pana la intalnirea lui zero. Sa se afiseze cate numere s-au citit [2 rezolvari – cu while si cu do while].*/




public class Tema1Metode {

	public static void main(String[] args) {
		
	int	a =  GetNumbers.GetNumbers();
	int b=  GetNumbers.GetNumbers();
		
	Maxim.TheBigestNumber(a, b);
	if (a>=b) {
		CatRest.ReturnRestCat(a, b);
	}else {
		CatRest.ReturnRestCat(b, a);
	}
	
	NegPoz.PoziviteNegativeNumber(a);
	NegPoz.PoziviteNegativeNumber(b);
	
	
		System.out.println("Do you want to proceed with exercise 5,6,7? For YES input 1 ,For NO input 2");
		int c=GetNumbers.GetNumbers();
		if (c==2) {
			System.out.print("Game Over");
		}else {
			System.out.println("Insert how many numbers you want to input");
			int t=GetNumbers.GetNumbers();
			System.out.println("Insert prefered method: 1 for while or 2 for do-while");
			int p=GetNumbers.GetNumbers();
			if (p==1) {
				int[] ans =NrPozitiveNrNegative.NumerePozitiveWhile(t);
				System.out.println(" There are  "+ans[0]+" pozitive numbers");
				System.out.println("The sum is  "+ans[1]);
				
			}else {
				int[] ans =NrPozitiveNrNegative.NumerePozitiveDoWhile(t);
			System.out.println(" There are  "+ans[0]+" pozitive numbers");
			System.out.println("The sum is  "+ans[1]);
		}
	
 
	}
		System.out.println("we will proceed to exercise 7");
		System.out.println("Insert prefered method: 1 for while or 2 for do-while");
		int v=GetNumbers.GetNumbers();
		if (v==1) {
			System.out.println(NumbersUntil0.StopWhile()+" numbers were introduced");
		}else {
			System.out.println(NumbersUntil0.StopDoWhile()+" numbers were introduced");
		}

}
}
