package day5program;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

        System.out.print("Enter a year (4 digits): ");
        int year = input.nextInt();
        input.close();

        if (year >= 1000 && year <= 9999) {
            if (isLeapYear(year)) {
                System.out.println(year + " is a leap year.");
            } else {
                System.out.println(year + " is not a leap year.");
            }
        } else {
            System.out.println("Please enter a valid 4-digit year.");
        }
    }

    public static boolean isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
	}
	}

