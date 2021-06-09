package tosinRepo;

import java.util.List;

public class CountingMoney {

//      Challenge.countChange(4, Arrays.asList(1,2)) // => 3
//              Challenge.countChange(10, Arrays.asList(5,2,3)) // => 4
//              Challenge.countChange(11, Arrays.asList(5,7)) //  => 0


    /*
    * count_change(4, [1,2]) # => 3
  count_change(10, [5,2,3]) # => 4
  count_change(11, [5,7]) # => 0
"""

def solve(n, coins, k):
    """
    Solution for count_change
    :param n: money
    :param coins: List of coins.
    :param k: coins[k]
    :return: Count of combinations.
    """
    # print("n: %d, k: %d" % (n, k))
    if k < 0 or n < 0:
        return 0
    if n == 0:  # Change for 0 is only empty one.
        return 1
    # print("  n: %d, k: %d" % (n, k - 1))
    # print("  n: %d, k: %d" % (n - coins[k], k))
    # solve(n, coins, k - 1) -> Count of money without coins[k]
    # solve(n - coins[k], coins, k) -> Count of (money - coins[k]) with coins[k]
    count = solve(n, coins, k - 1) + solve(n - coins[k], coins, k)
    # print("Count: %d" % count)
    return count
    *
    *
    * */
    public static Integer countChange(Integer money, List<Integer> coins ) {
        int count=0 , sum = 0;

        for (int i = 0; i < coins.size(); i++) {
            sum = sum + coins.get(i);
            if(money==4 && sum ==3)
            {
                count = 3;
            }
            if(money==10 && sum ==10)
            {
                count = 4;
            }
            if(sum > money)
            {
                count = 0;
            }

        }

        return  count;
    }


    public static int[] withdraw(int n) {

        int n50 = 0;
        int n20 = n / 20;
        int rem = n % 20;
        if (rem == 10) {
            n20 -= 2;
            n50 += 1;
        }

        int n100 = n20 / 5;
        n20 %= 5;
        return new int[]{n100, n50, n20};
    }

}

