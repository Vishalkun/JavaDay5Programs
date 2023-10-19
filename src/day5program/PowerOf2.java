package day5program;

public class PowerOf2 {

	public static void main(String[] args) {
		if (args.length != 1) {
            System.out.println("Please provide one integer command-line argument");
            return;
        }

        int N = Integer.parseInt(args[0]);

        if (N < 0 || N >= 31) {
            System.out.println("N must be in the range ");
            return;
        }

        for (int i = 0; i <= N; i++) {
            int powerOf2 = (int) Math.pow(2, i);
            System.out.println("2^" + i + " = " + powerOf2);
	}

}}
