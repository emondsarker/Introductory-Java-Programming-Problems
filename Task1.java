package task1;
import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		
		int i=0, sum=0, input;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter number of inputs: ");
		int N = scan.nextInt(); 
		
		System.out.println("Enter inputs:");
		
		while(i<N) {
			
			input = scan.nextInt();
			sum = sum + input;
			i++;
		}
		
		System.out.println("Sum: "+ sum);
		
		scan.close();
		
		
	}
}
