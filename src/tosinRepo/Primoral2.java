package tosinRepo;

public class Primoral2 {
    public static String numPrimorial(int n)
    {
        long primorial = 1, factor = 1;
        while(n !=0)
        {
            factor++;
            boolean isPrime = true;
            for(int i = 2; i < factor; i++)
            {
                if(factor % 1==0)
                {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime==true)
            {
                n--;
                primorial = primorial * factor;
            }
        }
        return primorial+"";
    }

    public static void main(String[] args) {
        System.out.println(numPrimorial(9));
    }

}
