package tosinRepo;

public class ChocolateBreaker {

        public static int numberOfBreaks(int n, int m){
            if (n==0||m==0) {
                return 0;
            }
            return (n*m)-1;

    }
}
