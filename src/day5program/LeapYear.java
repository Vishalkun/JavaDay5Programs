package day5program;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

        System.out.print("Enter a year");
        int year = input.nextInt();
        input.close();

        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
        {
            System.out.print("it is a Leap Year."+ year);
        }
        else
        {
            System.out.print("it is not a Leap Year:"+ year);
              
	}
<<<<<<< HEAD
	}}
=======
	}
}
>>>>>>> 7a37e48b598ef8df572291857b50a060dca85069

