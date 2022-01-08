package New;

import java.util.List;

public class Shedulingg {
    public static Integer sjf(List<Integer> jobs, Integer index ) {
        int answer = 0;
        int data = jobs.get(index);
        for (Integer x:jobs) {
            if(x <=data){
                answer +=x;
            }
        }
        for (int i = 0; i < jobs.size(); i++) {
            if(jobs.get(i)==data){
                answer -=jobs.get(i);
            }
        }
        return answer;
    }
}
