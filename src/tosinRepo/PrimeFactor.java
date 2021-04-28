package tosinRepo;

import java.util.*;

public class PrimeFactor
{
    public static  String factors(int lst)
    {
        var primes = new ArrayList<String>();
        for(int number = 2; number<lst; number++)
        {
            int count =0;
            while (lst % number ==0)
            {
                count++;
                lst /= number;
            }
            if(count==0) continue;
            primes.add(String.format(count > 1 ? "({0}**{1})":"({0})",number,count));
        }
        return  String.join("",primes);
    }
//    public static String mapDemo()
//    {
//
//    }

    public static void main(String[] args) {
        System.out.println(factors(9));
        Map<String,Integer> map = new HashMap<>();
        map.put("Tosin",123);
        map.put("Yemi",456);
        map.put("Ayobami",789);
        Set<Map.Entry<String,Integer>> set = map.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator = set.iterator();
        while (iterator.hasNext())
        {
            Map.Entry<String, Integer> e = iterator.next();
            System.out.println(e.getKey() +"=" +e.getValue());

        }
    }
}
