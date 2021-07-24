package New;
class box{
    int wei;
    int sei;
    int len;
}

public class Test  implements  Runnable{
    public static void main(String[] args) {

       int sum;
        box b =new box();
        box c = new box();
        b.wei = 1;
        c = b;
        System.out.println(c.wei);
        Thread thread = new Thread(new Test());
        thread.start();
        thread.start();
        System.out.println(thread.getState());

    }

    @Override
    public void run() {
        System.out.println("Turing");
    }
}
