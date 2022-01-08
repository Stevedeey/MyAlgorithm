package selfpractice;

public class FixBuzzGreedyDice {
    public static void fizzbuzz() {
        for (int i = 1; i <= 15; i++) {
            if (i % (3 * 5) == 0) System.out.println("FizzBuzz");
            else if (i % 5 == 0) System.out.println("Fizz");
            else if (i % 3 == 0) System.out.println("Buzz");
            else System.out.println(i);
        }
    }

    public static int greedy(int[] dice) {

        /**
         *  Three 1's => 1000 points
         *  Three 6's =>  600 points
         *  Three 5's =>  500 points
         *  Three 4's =>  400 points
         *  Three 3's =>  300 points
         *  Three 2's =>  200 points
         *  One   1   =>  100 points
         *  One   5   =>   50 point
         * [5,1,3,4,1]
         * [1,1,1,3,1]
         */
        int one = 0, two = 0, three = 0, four = 0, five = 0, six = 0, total = 0;
        for (int i = 0; i < dice.length; i++) {

            if (dice[i] == 1) {
                one++;
            }
            if (one == 3) {
                total = 0;
                total += 1000;
            } else if (one < 3) {
                total += (one * 100);
            }

            //two
            if (dice[i] == 2) {
                two++;
            }
            if (two == 2) {
                total += 200;
            } else if (two < 3) {
                total += (two * 200);
            }

            //three
            if (dice[i] == 3) {
                three++;
            }
            if (three == 3) {
                total += 300;
            } else if (three < 3) {
                total += (three * 300);
            }


            if (dice[i] == 4) {
                four++;
            }
            if (four == 3) {
                total += 400;
            } else if (four < 3) {
                total += (four * 400);
            }


            if (dice[i] == 5) {
                five++;
            }
            if (five == 3) {
                total = 0;
                total += 500;
            } else if (five < 3) {
                total += (five * 50);
            }


            if (dice[i] == 6) {
                six++;
            }
            if (six == 3) {
                total += 600;
            } else if (six < 3) {
                total += (six * 600);
            }

        }


        return total;
    }

    public static void main(String[] args) {


     ///   FixBuzz.fizzbuzz();
        for (int i = 1; i <=15; i++) {
            if(i % 5==0){
                if(i % 3 == 0 ){
                    System.out.println("FizzBuzz");
                }
                else{
                    System.out.println("Fizz");
                }
            }
            else if(i % 3 == 0) {System.out.println("Buzz");}
            else System.out.println(i);

        }

    }
}
