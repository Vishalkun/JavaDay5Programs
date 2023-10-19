package day5program;

public class Prime_Factors {

	public static void main(String[] args) {
		if (args.length != 1) {
            System.out.println("Please provide a single integer as input.");
            return;
        }

        int N = Integer.parseInt(args[0]);
        if (N <= 1) {
            System.out.println("Please provide a positive integer greater than 1.");
            return;
        }

        System.out.print("Prime factors of " + N + " are: ");
        primeFactorization(N);
        System.out.println();
    }

    public static void primeFactorization(int N) {
        for (int i = 2; i * i <= N; i++) {
            while (N % i == 0) {
                System.out.print(i + " ");
                N /= i;
            }
        }

        if (N > 1) {
            System.out.print(N);
        }
	}

}
