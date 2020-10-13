package gcLab4;

import java.util.*;

public class TableOfPowers {

	public static void main(String[] args) {
		
		int userInput;
		String cont = "y";
		int squaredUi = 1;
		int cubedUi = 1;
		boolean neg;
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Learn your squares and cubes!\n");
		
		
		while (cont.equals("y")) {
		
		System.out.println("Enter an integer: ");
		userInput = scn.nextInt();
		
		if (userInput < 0) {
			neg = true;
		} else {
			neg = false;
		}
		
		userInput = Math.abs(userInput);
		
		System.out.printf("%6s  %6s  %6s\n", "Number", "Squared", "Cubed");
		System.out.printf("======  =======  ======\n");
		
		for (int i = 1; i <= userInput; i++) {
			squaredUi = i * i;
			cubedUi = i * i * i;
			
				if (neg) {
					
					System.out.printf("%6s  %6s  %6s\n", (i * -1), squaredUi, (cubedUi * -1));
					
				} else {
					
					System.out.printf("%6s  %6s  %6s\n", i, squaredUi, cubedUi);
				}

			
		}
		
		
		System.out.println("Multiplication Table");
		
		System.out.format("      ");
        for(int x = 1; x <= userInput; x++) {
            System.out.format("%4d", x);
        }
        System.out.println();
        System.out.println(" ===============================================");
         
        for(int d = 1; d <= userInput; d++) {

            System.out.format("%4d |",d);
            for(int j=1; j <= userInput; j++) {
                System.out.format("%4d", d*j);
            }
            System.out.println();
        }
		
       
        
		System.out.println("Continue? (y/n): ");
		cont = scn.next();
		


		}
		scn.close();
	}

}
