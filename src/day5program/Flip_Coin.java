package day5program;

import java.util.Random;
import java.util.Scanner;

public class Flip_Coin {
	
		
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of times to flip the coin: ");
        int numberOfFlips = input.nextInt();
        input.close();

        if (numberOfFlips <= 0) {
            System.out.println("Please enter a positive integer for the number of flips.");
            return;
        }

        int headsCount = 0;
        int tailsCount = 0;
        Random random = new Random();

        for (int i = 0; i < numberOfFlips; i++) {
            if (random.nextDouble() < 0.5) {
                tailsCount++;
            } else {
                headsCount++;
            }
        }

        double headsPercentage =  headsCount / numberOfFlips * 100;
        double tailsPercentage =  tailsCount / numberOfFlips * 100;

        System.out.println("Heads: " + headsCount + " (" + headsPercentage + "%)");
        System.out.println("Tails: " + tailsCount + " (" + tailsPercentage + "%)");
    }
	}


