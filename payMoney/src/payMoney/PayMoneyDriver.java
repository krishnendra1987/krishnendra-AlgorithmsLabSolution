package payMoney;

import java.util.Scanner;

public class PayMoneyDriver {
	private static Scanner sc = new Scanner(System.in);
	private static int transactionArray[];
	private static int numberOfTransaction;
	private static int transactionArraySize;

	public static void main(String[] args) {
		System.out.println("Enter the size of transaction array");
		transactionArraySize = sc.nextInt();
		transactionArray = new int[transactionArraySize];
		System.out.println("Enter the values of transaction array");
		for (int i = 0; i < transactionArraySize; i++) {
			transactionArray[i] = sc.nextInt();
		}
		System.out.println("Enter the total number of targets need to be achived");
		int totalNumberOfTargetNeedtoAchive = sc.nextInt();

		for (int i = 0; i < totalNumberOfTargetNeedtoAchive; i++) {
			System.out.println("Enter the value of target");
			int targetValue = sc.nextInt();
			int sum = 0;

			for (int j = 0; j < transactionArraySize; j++) {
				sum = sum + transactionArray[j];

				if (targetValue <= sum) {
					int transactionNumber = j + 1;
					System.out.println("Transaction Achived after " + transactionNumber + " transactions");
					break;
				}

			}

			if (targetValue > sum) {
				System.out.println("Transaction is not achived");

			}

		}
		
		sc.close();

	}

}
