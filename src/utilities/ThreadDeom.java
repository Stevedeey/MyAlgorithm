package utilities;

public class ThreadDeom extends Thread {
    @Override
    public void run() {
        System.out.println("this is my thread" + Thread.currentThread());
    }

    public static void main(String[] args) {
        ThreadDeom th = new ThreadDeom();
        th.start();
    }
}
