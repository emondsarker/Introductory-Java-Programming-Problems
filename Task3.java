package task3;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		
		int n=1;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter number of rows: ");
		int numberOfRows = scan.nextInt();
		scan.close();
		
		for(int i=1; i<= numberOfRows; i++) {
			
			if(i%2 != 0) {
				
				for(int j=0; j<n; j++) {
					
					System.out.print("*");
				}
				
				System.out.println();
			}
			else {
				
				for(int j=0; j<n; j++) {
					
					System.out.print("+");
					}
				
				System.out.println();
			}
			
			n+=2;
		}

	}

}
