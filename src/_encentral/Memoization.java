package _encentral;

import java.util.ArrayList;
import java.util.List;

public class Memoization {

    public static List<Integer> memoizeCache = new ArrayList<>();

    public List<Integer> getList() {
        return memoizeCache;
    }

    public static Integer calculate(Integer number){

        if(number == 0){
            return 1;
        }else {
            if(memoizeCache.size() >= number){
                System.out.println("Retrieved from cache: "+ number);
                return memoizeCache.get(number - 1); //factorial will return what was last stored in the list
            }
            int temp = number - 1;
            System.out.println("Calculate for input: "+ number);
            int factorial = number * calculate(temp);
            memoizeCache.add(factorial);
            return factorial;

        }
    }

}

