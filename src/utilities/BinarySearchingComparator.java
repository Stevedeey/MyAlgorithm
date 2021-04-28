package utilities;

import java.util.*;

class BinarySearchingComparator implements Comparable<BinarySearchingComparator> {
    int salary;
    String name;

    public BinarySearchingComparator(String name) {
        this.name = name;
    }

    public BinarySearchingComparator(int salary) {
        this.salary = salary;
    }

    public BinarySearchingComparator(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String toString() {
        return this.name + " (salary: " + salary + ")";
    }

    public int compareTo(BinarySearchingComparator another) {
        return this.name.compareTo(another.name);
    }

    public static void main(String[] args) {


        List<BinarySearchingComparator> listEmployees = new ArrayList<>();

        listEmployees.add(new BinarySearchingComparator("Tom", 40000));
        listEmployees.add(new BinarySearchingComparator("Adam", 60000));
        listEmployees.add(new BinarySearchingComparator("Jim", 70000));
        listEmployees.add(new BinarySearchingComparator("Dane", 35000));
        listEmployees.add(new BinarySearchingComparator("Jack", 56000));
        listEmployees.add(new BinarySearchingComparator("Carol", 67000));

        Comparator<BinarySearchingComparator> comparator = new Comparator<BinarySearchingComparator>() {
            public int compare(BinarySearchingComparator emp1, BinarySearchingComparator emp2) {
//                  return emp1.name.compareTo(emp2.name);
                return emp1.salary-emp2.salary;
            }
        };

        BinarySearchingComparator min = Collections.min(listEmployees, comparator);

        System.out.println("Least paid employee: " + min);


        //BINARY SEARCH
        BinarySearchingComparator jim = new BinarySearchingComparator("Jim");

        Collections.sort(listEmployees);

        int index = Collections.binarySearch(listEmployees, jim);

        if (index >= 0) {
            jim = listEmployees.get(index);
            System.out.println("Found employee: " + jim);
        }

        Comparator<BinarySearchingComparator> comparator2 = new Comparator<BinarySearchingComparator>() {
            public int compare(BinarySearchingComparator emp1, BinarySearchingComparator emp2) {
                return emp1.salary - emp2.salary;
            }
        };

        //BINARY SEARCH WITH COMPARATOR
        Collections.sort(listEmployees, comparator);

        BinarySearchingComparator keyEmp = new BinarySearchingComparator(70000);

        int index2 = Collections.binarySearch(listEmployees, keyEmp, comparator2);

        if (index >= 0) {
            keyEmp = listEmployees.get(index2);
            System.out.println("Found: " + keyEmp);
        }

// Search where a list contained in another:
        List<Integer> source = Arrays.asList(91, 92, 93, 92, 95, 96, 97, 98, 99);
        List<Integer> target = Arrays.asList(95, 96, 97);

        int startingIndex = Collections.indexOfSubList(source, target);

        System.out.println("Starting position: " + startingIndex);


        //Search the last position of the target list within the source list:
        List<Integer> source2 = Arrays.asList(18, 33, 66, 99, 22, 33, 66, 11, 100);
        List<Integer> target2 = Arrays.asList(33, 66);

        int lastIndex = Collections.lastIndexOfSubList(source2, target2);

        System.out.println("Last index : " + lastIndex);

    }
}