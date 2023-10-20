package day5program;

public class PowerOf2 {
	public static void power2()
	{
		int n, pow, i;
        for(i = 0; i < 10; i++)
        {
            pow = 1;
            n = i;

            while(n > 0)
            {
                pow *= 2;
                n--;
            }
            System.out.print(pow);

        }
    }

	public static void main(String[] args) {

		PowerOf2  p= new PowerOf2();
		p.power2();
		
	}
	}
	
