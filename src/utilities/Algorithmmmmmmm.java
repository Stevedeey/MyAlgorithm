package utilities;

public class Algorithmmmmmmm {
    /**
     * Individual part of a running program. A group of thread is a program. A part of a program that runs to accomplish a task.
     */
    /** Problems of threads
     *  1. Usually very hard to find bugs
     * 	2.	Higher cost of code maintenance
     * 	3.	Increased utilization of system resources.
     * 	4.	Programs may experience slowdown
     * 	Advantages
     * 	1. Responsive applications
     * 	2. Utilize resources efficiently
     * 	3. Higher throughout
     * 	Deadlock : When two threads are waiting for the same resource indefinitely
     * 	Synchronized: blocks access to a resource until a thread is done executing
     */


    /**
     * Thread cycle
     * New->RUNABLE->RUNNING->Then if there is an interruption, the flow move to blocked/waiting state and then stop, if theere is no
     * interruption it stops from the running state.
     *
     *
     */
    /**
     * Sockets provide the communication mechanism between two computers using TCP
     * socket programming is a way of keeping persistent connection between a server and client
     * Hand shaking is the process of establishing connection between two devices
     *
     * Between Socket and HTTP
     * 1a. WebSocket is a bidirectional communication protocol that can send the data from the client to the server
     * or from the server to the client by reusing the established connection channel. The connection is kept alive
     * until terminated by either the client or the server.
     *
     * 1b. The HTTP protocol is unidirectional protocol works on the top of TCP protocol which is a connection-oriented transport layer protocol,
     * we can create the connection by using HTTP request methods after getting the response HTTP connection get closed.
     *
     * 2a Almost all the real-time application like (trading, monitoring, notification) services
     * uses WebSocket to receiving the data on a single communication channel.
     *
     * 2b Simple RESTful application uses HTTP protocol which is stateless.
     * 3a All the frequently updated applications used WebSocket because it is faster than HTTP Connection.
     * When we do not want to retain a connection for a particular amount of time or reusing the single connection for
     * transmitting the data, HTTP connection is slower than the WebSocket..
     *
     * 200 OK. Standard response for successful HTTP requests
     *
     * A
     * API endpoint is a communication channel between a client and server from which a resource can be retrieved.
     * provides in which two software can communicate with each other
     *
     * API is any application that can be interacted with.
     *  The route to that application is an API ENDPOINT
     *
     *  Will I be correct If I say an API is created and
     *  exist on top of a software and can allow the resources from the software a to be
     *  accessed and guarantees that the resources can be retrieved by an external software via an API endpoint?
     */

    //concurrency:  concurrency is the ability to run several programs or several parts of a program in parallel
        //The very first class, you will need to make a java class concurrent, is java.lang.Thread class. This class is the basis of all concurrency concepts in java. Then you have java.lang.Runnable interface to abstract the thread behavior out of thread class.
    //
    //Other classes you will need to build advance applications can be found at java.util.concurrent

    //    Demonstration of threads
    //Concurrency is the ability of a system to handle multiple things by creating multiple execution units.
    // Multithreading is the concept which helps create multiple execution units.
    //It works as target to achieve for a Java developer.	It works as a tool to achieve the concurrency target.

    /**
     *  Concurrency is the ability to handle multiple things at same or overlapping time.
     * Parallelism is the ability to execute multiple things exactly at the same time
     */
//    class Demonstration {
//        public static void main( String args[] ) throws InterruptedException {
//            SumUpExample.runTest();
//        }
//    }
//
//    class SumUpExample {
//
//        long startRange;
//        long endRange;
//        long counter = 0;
//        static long MAX_NUM = Integer.MAX_VALUE;
//
//        public SumUpExample(long startRange, long endRange) {
//            this.startRange = startRange;
//            this.endRange = endRange;
//        }
//
//        public void add() {
//
//            for (long i = startRange; i <= endRange; i++) {
//                counter += i;
//            }
//        }
//
//        static public void twoThreads() throws InterruptedException {
//
//            long start = System.currentTimeMillis();
//            SumUpExample s1 = new SumUpExample(1, MAX_NUM / 2);
//            SumUpExample s2 = new SumUpExample(1 + (MAX_NUM / 2), MAX_NUM);
//
//            Thread t1 = new Thread(() -> {
//                s1.add();
//            });
//
//            Thread t2 = new Thread(() -> {
//                s2.add();
//            });
//
//            t1.start();
//            t2.start();
//
//            t1.join();
//            t2.join();
//
//            long finalCount = s1.counter + s2.counter;
//            long end = System.currentTimeMillis();
//            System.out.println("Two threads final count = " + finalCount + " took " + (end - start));
//        }
//
//        static public void oneThread() {
//
//            long start = System.currentTimeMillis();
//            SumUpExample s = new SumUpExample(1, MAX_NUM );
//            s.add();
//            long end = System.currentTimeMillis();
//            System.out.println("Single thread final count = " + s.counter + " took " + (end - start));
//        }
//
//
//        public static void runTest() throws InterruptedException {
//
//            oneThread();
//            twoThreads();
//
//        }
}
