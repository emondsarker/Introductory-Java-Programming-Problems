# Introductory-Java-Programming-Problems

## Task-1

### Write a program that will read N numbers using a while-loop and will display their sum. N will be input to your program.

```
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
```
---

## Task-2

### Write a program that takes an arithmetic operator ('+', '-', '*' or '/') and two operands as input and performs the corresponding arithmetic operation on the operands. You must use switch-case to solve the problem.

```

```

---

## Task-3

### Write a program that prints the following pattern.

```
*
+++
*****
+++++++
*********
```
```
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
```
