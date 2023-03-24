package _encentral;

import java.util.List;

public class Generic {
    public static void main(String[] args) {

        Counter<Integer> iCounter = new Counter<>(1);
        Counter<Double> iDouble = new Counter<>(1.0);
        Counter<Long> iLong = new Counter<>(3l);
//        Counter<String> sString = new Counter<>("");

    }

    public static class Counter<T extends Number>{

        T t;

        public Counter(T t){
            this.t = t;
        }
        public void print(){
            System.out.println(t);
        }

        public static <T, U> void get(T t, U u){

        }
        public static void geList(List<? extends Number> list){

        }
    }








    public static class IntegerCounter
    {
        Integer i;

        IntegerCounter(Integer i){
            this.i = i;
        }

        public void print(){
            System.out.println(i);
        }
    }
    public static class DoubleCounter{

        Double i;

        DoubleCounter(Double i){
            this.i = i;
        }

        public void print(){
            System.out.println(i);
        }
    }
}
