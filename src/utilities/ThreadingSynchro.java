package utilities;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpHeaders;
import java.net.http.HttpRequest;
import java.time.Duration;
import java.util.Optional;
import java.util.Timer;

public class ThreadingSynchro {
//    private static class Thread1 extends Thread {
//        public void run() {
//            synchronized (LockingWithAString) {
//                System.out.println("Thread1 holding lock 1 and 2");
//
//                try {
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                    System.out.println("Thread1 waiting for lock 2");
//                }
//
//                synchronized (LockingWithAnoterString) {
//                    System.out.println("Thread1 holding lock 1 and 2");
//                }
//            }
//
//        }
//    }
//    private static class Thread2 extends Thread
//    {
//        public void run()

//        {
//            synchronized (LockingWithAnoterString){
//            System.out.println("Thread1 holding lock 1 and 2");
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) { }
//                System.out.println("Thread1 waiting for lock 2");
//
//                synchronized (LockingWithAString){
//                    System.out.println("Thread1 holding lock 1 and 2");
//                }
//
//            }
//        }
//
//    }
}
    //class David
//{
//    public static void main(String[]args) throws IOException {
//        int port = 8080;
//        System.out.println("Starting the server, with port"+port);
//        ServerSocket socketSocket = new ServerSocket(port);
//        //Task task = new Task("Tosin");
//        Timer timer = new Timer();
//        timer.scheduleAtFixedRate(task,8000,8000);
//        while(true)
//        {
//            Socket socket = socketSocket.accept();
//            HttpRequest request = new HttpRequest(socketSocket);
//            Thread thread =  new Thread(request);
//            thread.start();
//            }
//        }
//
//    }
   // Timer timer = new Timer();

//}
