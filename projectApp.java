import java.util.Scanner;

public class projectApp {

	public static void main(String[] args) {
	Scanner userInput = new Scanner(System.in);
	
	// Prompt user to input numbers
	System.out.print("Enter five digits");
	
	// User sets five digit value
	int value = userInput.nextInt();
	
	// Set values
	int original = value;
	int reverse = 0;
	int remainder;
	
	// Method for reversing numbers with while loop
	while(original > 0){
		remainder = original %10;
		reverse = reverse * 10 + remainder;
		original = original/10;
	}
	//Display numbers in reverse order
System.out.print("You entered: " + reverse + " but backwards");
	}

}
