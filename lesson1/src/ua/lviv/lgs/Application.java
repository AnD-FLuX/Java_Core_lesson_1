package ua.lviv.lgs;

public class Application {

	public static void main(String[] args) {

		byte a;
		short b;
		int c;
		long d;
		char e;
		float k;
		double l;
		boolean m;

		int s = 20;
		int minNumb = 0;
		int maxNumb = 1000;
		int max = 0;
		int min = maxNumb;
		int[] numbers = new int[s];

		System.out.println("Мінімальне значення типу даних byte: " + Byte.MIN_VALUE);
		System.out.println("Максимальне значення типу даних byte: " + Byte.MAX_VALUE);
		System.out.println("-----------------------------------");
		System.out.println("Мінімальне значення типу даних short: " + Short.MIN_VALUE);
		System.out.println("Максимальне значення типу даних short: " + Short.MAX_VALUE);
		System.out.println("-----------------------------------");
		System.out.println("Мінімальне значення типу даних int: " + Integer.MIN_VALUE);
		System.out.println("Максимальне значення типу даних int: " + Integer.MAX_VALUE);
		System.out.println("-----------------------------------");
		System.out.println("Мінімальне значення типу даних long: " + Long.MIN_VALUE);
		System.out.println("Максимальне значення типу даних long: " + Long.MAX_VALUE);
		System.out.println("-----------------------------------");
		System.out.println("Мінімальне значення типу даних char: " + (Character.MIN_VALUE + 0));
		System.out.println("Максимальне значення типу даних char: " + (Character.MAX_VALUE + 0));
		System.out.println("-----------------------------------");
		System.out.println("Мінімальне значення типу даних float: " + Float.MIN_VALUE);
		System.out.println("Максимальне значення типу даних float: " + Float.MAX_VALUE);
		System.out.println("-----------------------------------");
		System.out.println("Мінімальне значення типу даних double: " + Double.MIN_VALUE);
		System.out.println("Максимальне значення типу даних double: " + Double.MAX_VALUE);
		System.out.println("-----------------------------------");
		System.out.println("Мінімальне значення типу даних boolean: " + Boolean.FALSE);
		System.out.println("Максимальне значення типу даних boolean: " + Boolean.TRUE);
		System.out.println("-----------------------------------");
		System.out.println();
		
		
		System.out.println("Створено масив з кількістю " + s + " чисел, від " + minNumb + " до " + maxNumb + ":");

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = minNumb + (int) (Math.random() * maxNumb);
			System.out.println(numbers[i]);
		}

		for (int i = 0; i < numbers.length - 1; i++) {
			if (max < numbers[i]) {
				max = numbers[i];
			}
		}
		System.out.println("Максимальне число в масиві - " + max);

		for (int i = 0; i < numbers.length - 1; i++) {
			if (min > numbers[i]) {
				min = numbers[i];
			}
		}
		System.out.println("Мінімальне число в масиві - " + min);

	}
}
