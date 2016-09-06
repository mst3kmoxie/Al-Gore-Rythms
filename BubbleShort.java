import java.util.Scanner;

public class BubbleShort {

	static int[] bubbleSort(int[] numbers) {

		boolean flag = true; // set flag to true to begin first pass
		int temp = 0;
				
		for (int pass = 0; flag && pass < numbers.length; pass++) {
			flag = false; // set flag to false awaiting a possible swap
			for (int current = 0; current < numbers.length - (1 + pass); current++) {
				if (numbers[current] > numbers[current+1]) {
					// swap [current] and [current+1]
					temp = numbers[current];
					numbers[current] = numbers[current+1];
					numbers[current+1] = temp;
					flag = true;
					} // end of if statement
				}

				int item = pass + 1;
				System.out.print("Printing: Pass #" + item + ":  ");
				printArray(numbers);
				
		}
		return numbers;
	}

	static void printArray(int[] numbers) {
		int len = numbers.length;

		for (int i = 0; i < len; i++) {
			if (i < len - 1) {
				System.out.print(numbers[i] + ", ");
			} else {
				System.out.print(numbers[i]);
				System.out.println();
			}
		}
	}

	public static void main(String[] args) {

		// input from the user
		Scanner input = new Scanner(System.in);
		System.out.println("How many numbers do you want to sort? ");
		int numAnswer = input.nextInt();

		int[] inputArray = new int[numAnswer];

		System.out.println("Enter the " + numAnswer + " numbers now: ");

		for (int i = 0; i < numAnswer; i++) {
			inputArray[i] = input.nextInt();
		}

		System.out.println("Printing the array of numbers you entered: ");
		printArray(inputArray);

		// BubbleSort(user input)

		int[] sortedArray = bubbleSort(inputArray);

		// print the sorted numbers

		System.out.println("Printing the array in a sorted fashion:");
		printArray(sortedArray);

		input.close();
	}
}
