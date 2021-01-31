import java.util.Scanner;

public class GetNumbers {
	public static int GetNumbers() {
		Scanner sc = new Scanner(System.in);
		int number;
		boolean assumption =false;
		while (assumption==false) {
			System.out.println("Please enter   integer number!");
			if (!sc.hasNextInt()) {
				System.out.println("That is not an integer number");
				sc.next();
			}
				else {
					assumption=true;
				}
					
			
		}
		    
		  number = sc.nextInt();
		  
		return(number);

	}

}
