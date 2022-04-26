package _encentral;

import java.util.ArrayList;
import java.util.List;

public class GradeCalculation {
    public  static List<Integer> gradingStudents(List<Integer> grades) {
        int sum = 0;
        for (int i = 0; i < grades.size(); i++) {
            sum += grades.get(i);
        }
        int average = sum / grades.size();
        for (int i = 0; i < grades.size(); i++) {
            if (grades.get(i) < average) {
                grades.set(i, 1);
            } else if (grades.get(i) == average) {
                grades.set(i, 2);
            } else {
                grades.set(i, 3);
            }
        }
        return grades;
    }

    //HackerRank
    public  static List<Integer> gradingStudents2(List<Integer> grades) {
        List<Integer> ans = new ArrayList<Integer>();
        for (int marks : grades) {
            if (marks < 38 || marks % 5 <= 2) {
                ans.add(marks);
            } else if (marks % 5 > 2) {
                int add = 5 - (marks % 5);
                ans.add(marks + add);
            }
        }
        return ans;
    }
}
