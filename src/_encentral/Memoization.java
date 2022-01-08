package _encentral;

import java.util.ArrayList;
import java.util.List;

public class Memoization {

     List<Integer> list = new ArrayList<>();

    public List<Integer> getList() {
        return list;
    }

    public  Integer calculate(Integer number){

        if(number == 0){
            return 1;
        }else {
            if(list.size() >= number){
                System.out.println("Retrieved from cache: "+ number);
                return list.get(number - 1);
            }
            int factorial = number * calculate(number - 1);
            list.add(factorial);
            System.out.println("Calculate for input: "+ number);
            return factorial;

        }
    }
}
