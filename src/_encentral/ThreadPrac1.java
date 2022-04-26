package _encentral;

public class ThreadPrac1 implements Runnable{
    @Override
    public void run() {
        System.out.println("Thread Run");
        for (int i = 0; i < 10; i++) {
            System.out.println("Print {}"+i);
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

    public static void main(String[] args) {
      int res = squares(24, 29);
        System.out.println(res);

    }
//    private static boolean squareRoot(int num){
//        int res =  ((int)Math.sqrt(num)) * ((int)Math.sqrt(num)) ;
//        if(res == num) return true;
//        return false;
//    }

    public static int squares(int a, int b) {
        // Write your code here
        int sqrA = (int) Math.sqrt(a);
        int sqrB = (int) Math.sqrt(b);
        int count = 0;
        for (int i = sqrA; i <=sqrB; i++) {
           int res = i * i;
           if (res >= a && res <= b) {
               count++;
           }
        }
        return count;
    }

}
