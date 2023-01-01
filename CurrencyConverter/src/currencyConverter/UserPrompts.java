package currencyConverter;

import java.util.Scanner;

public  class UserPrompts {
	public static int promptUserCurrencyCode(String message) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(
				"Please select " + message + ":\n1 - EUR (Euro)\n2 - USD (US Dollar)\n3 - GBP (British Pound Sterling)"
				+ "\n4 - AUD (Australian Dollar)\n5 - CAD ( Canadian Dollar)\n6 - BRL (Brazilian Real)\n7 - CNY (Chinese Yuan)\n8 - HKD (Hong Kong Dollar)"
				+ "\n9 - MXN (Mexican Peso)\n10 - INR (Indian Rupee)\n11 - KRW (South Korean Won)\n12 - JPY (Japanese Yen)");
		int code = scanner.nextInt();
		return code;
	}

	public static double promptUserValue() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a value to convert:");
		double value = scanner.nextDouble();
		return value;
	}
	
	public static boolean promptUserGoAgain() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Press 'y' to convert another amount.");
		String selection = scanner.next();
		if (selection.equals("y") || selection.equals("Y")) {
			return true;
		}
		return false;
	}
}
