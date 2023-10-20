package day5program;

import java.util.Random;
import java.util.Scanner;

public class Flip_Coin {
	
		
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of times to flip the coin: ");
        int flip = input.nextInt();
        input.close();

        int head = 0;
        int tail= 0;
        int headcount = 0;
        int tailcount = 0;

        double headpercentage;
        double tailpercentage;

        
            for(int i = 0;i<flip;i++)
            {
                Random random = new Random();
                int coin = random.nextInt(2);

              if(coin<0.5)
              {
            	  System.out.println("tails");
                tailcount++;
				
              }
            else
              {
            	System.out.print("head");
            	headcount++;
              }
            }
        headpercentage = (headcount * 100) / flip;
        tailpercentage= (tailcount * 100)/flip;
        System.out.print("No of headpercentage" + headpercentage);
        System.out.print("No of tailpercentage" + tailpercentage);


    }
	}


