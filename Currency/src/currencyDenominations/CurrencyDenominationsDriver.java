package currencyDenominations;
import java.util.Arrays;
import java.util.Scanner;

public class CurrencyDenominationsDriver {
	private static Scanner sc = new Scanner(System.in);
	private static int currencyDenominationsArray[];
	private static int amountYouWantToPay;
	private static int currencyDenominationsSize;
	
	public static void main(String[] args) {
		System.out.println("Enter the size of currency denominations");
		currencyDenominationsSize = sc.nextInt();
		currencyDenominationsArray = new int[currencyDenominationsSize];
		
		
		System.out.println("Enter the currency denominations value");
		
		for (int i = 0; i < currencyDenominationsSize; i++) {
			currencyDenominationsArray[i] = sc.nextInt();
		}
		System.out.println("Enter the amount you want to pay");
		int amountYouWantToPay = sc.nextInt();
		
		MergeSort mergeSort = new MergeSort();
		mergeSort.sort(currencyDenominationsArray, 0, currencyDenominationsArray.length-1);

		//countNotes
				System.out.println(Arrays.toString(currencyDenominationsArray));
				notesCountImplementation(currencyDenominationsArray,  amountYouWantToPay);
	}
	
	
	public static void notesCountImplementation(int notes[], int amount) {
		int[] notesCounter = new int[notes.length];
		try {
			for (int i = 0; i < notes.length; i++) {
				if (amount >= notes[i]) {
					notesCounter[i] = amount / notes[i];
					amount = amount - notesCounter[i] * notes[i];
				}
			}
			//If amount cannot be paid
			if(amount > 0) {
				System.out.println("Exact amount cannot be given with the highest denomination");	
			}else {
				System.out.println("Your payment approach in order to give min no of notes ");
       
				for (int i = 0; i < notes.length; i++) {
					if (notesCounter[i] != 0) {
						System.out.println(notes[i] + " : " + notesCounter[i]);
					}
				}
			}
		
		} catch(ArithmeticException e) {
			System.out.println(e+ "notes of denomination 0 is invalid");
		}
	}

}
