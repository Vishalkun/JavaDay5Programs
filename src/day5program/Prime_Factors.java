package day5program;
public class Prime_Factors {
	 public static void primeFactor(int n) {
		    System.out.print("Prime Factors : ");
		    for (int i = 2; i * i <= n || n > 1; i++) {

<<<<<<< HEAD
<<<<<<< HEAD
=======
	public static void main(String[] args) System.out.print("Prime Factors : ");
		    for (int i = 2; i * i <= n || n > 1; i++) {

>>>>>>> 7a37e48b598ef8df572291857b50a060dca85069
=======
	public static void main(String[] args) System.out.print("Prime Factors : ");
		    for (int i = 2; i * i <= n || n > 1; i++) {

>>>>>>> 7a37e48b598ef8df572291857b50a060dca85069
		      if (n % i == 0) {

		        while (n % i == 0) {

		          System.out.print(i + " ");
		          n = n / i;
		        }
		      }

		    }
		  }
	public static void main(String[] args) {
		 int n = 60;
		    primeFactor(n);
<<<<<<< HEAD
<<<<<<< HEAD
}}
=======
=======
>>>>>>> 7a37e48b598ef8df572291857b50a060dca85069
        }
	}

}
>>>>>>> 7a37e48b598ef8df572291857b50a060dca85069
