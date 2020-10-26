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

		System.out.println("̳������� �������� ���� ����� byte: " + Byte.MIN_VALUE);
		System.out.println("����������� �������� ���� ����� byte: " + Byte.MAX_VALUE);
		System.out.println("-----------------------------------");
		System.out.println("̳������� �������� ���� ����� short: " + Short.MIN_VALUE);
		System.out.println("����������� �������� ���� ����� short: " + Short.MAX_VALUE);
		System.out.println("-----------------------------------");
		System.out.println("̳������� �������� ���� ����� int: " + Integer.MIN_VALUE);
		System.out.println("����������� �������� ���� ����� int: " + Integer.MAX_VALUE);
		System.out.println("-----------------------------------");
		System.out.println("̳������� �������� ���� ����� long: " + Long.MIN_VALUE);
		System.out.println("����������� �������� ���� ����� long: " + Long.MAX_VALUE);
		System.out.println("-----------------------------------");
		System.out.println("̳������� �������� ���� ����� char: " + (Character.MIN_VALUE + 0));
		System.out.println("����������� �������� ���� ����� char: " + (Character.MAX_VALUE + 0));
		System.out.println("-----------------------------------");
		System.out.println("̳������� �������� ���� ����� float: " + Float.MIN_VALUE);
		System.out.println("����������� �������� ���� ����� float: " + Float.MAX_VALUE);
		System.out.println("-----------------------------------");
		System.out.println("̳������� �������� ���� ����� double: " + Double.MIN_VALUE);
		System.out.println("����������� �������� ���� ����� double: " + Double.MAX_VALUE);
		System.out.println("-----------------------------------");
		System.out.println("̳������� �������� ���� ����� boolean: " + Boolean.FALSE);
		System.out.println("����������� �������� ���� ����� boolean: " + Boolean.TRUE);
		System.out.println("-----------------------------------");
		System.out.println();
		
		
		System.out.println("�������� ����� � ������� " + s + " �����, �� " + minNumb + " �� " + maxNumb + ":");

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = minNumb + (int) (Math.random() * maxNumb);
			System.out.println(numbers[i]);
		}

		for (int i = 0; i < numbers.length - 1; i++) {
			if (max < numbers[i]) {
				max = numbers[i];
			}
		}
		System.out.println("����������� ����� � ����� - " + max);

		for (int i = 0; i < numbers.length - 1; i++) {
			if (min > numbers[i]) {
				min = numbers[i];
			}
		}
		System.out.println("̳������� ����� � ����� - " + min);

	}
}
