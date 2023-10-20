package day5program;

import java.util.Scanner;

public class Harmonic_Number {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

        System.out.print("Enter the value of N: ");
        int N = input.nextInt();
        input.close();

        if (N == 0) {
            System.out.println("N must be a positive integer.");
            return;
        }

        double harmonicValue = 0.0;
        for (int i = 1; i <= N; i++) {
            harmonicValue += 1.0 / i;
        }

        System.out.println("The " + N + " Harmonic Value is: " + harmonicValue);
	}

}
