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
     * 	4. Reduces cost of maintenance.
     * 	5. Reduces development time
     * 	6. Parallelize task
     * 	7. Improve the responsiveness of user interface
     * 	8. Improves the performance of complex tasks.
     *
     * Deadlock : When two threads are waiting for the same resource indefinitely
     * 	Synchronized: blocks access to a resource until a thread is done executing
     *
     * 	USES:
     * 	To provide simultaneous execution of two or more parts of a program.
     * 	The main purpose of multithreading is to provide simultaneous execution of two or more parts of a program to utilize the CPU time as much as possible
     * 	Java applications are naturally threaded. The runtime environment begins the execution of the program with the main() method in one thread. Garbage collection takes place in another thread. Screen updating occurs in a third thread. There may be other threads running as well, mostly related to the behavior of the virtual machine. All of this happens invisibly to the programmer. Sometimes you’re only concerned with what happens in the primary thread which includes the main() method of a program. If this is the case, you may not need to worry about threading at all.
     */
    //is a computer program that runs as a background process, rather than being under the direct control of an interactive user

    /**
     * Thread cycle
     * New->RUNABLE->RUNNING->Then if there is an interruption, the flow move to blocked/waiting state and then stop, if theere is no
     * interruption it stops from the running state.
     *
     * There are two ways to create a thread:
     * 1. extends Thread class:  The extending class must override run() method which is the entry point of new thread.
     * public class MyThread extends Thread{
     *      public void run()
     *      {
     *       System.out.println("Thread started running..");
     *      }
     *      public static void main( String args[] )
     *      {
     *         MyThread mt = new  MyThread();
     *         mt.start();
     *      }
     * }
     *
     * 2. implement Runnable interface
     * The easiest way to create a thread is to create a class that implements the runnable interface. After implementing runnable interface , the class needs to implement the run() method, which is
     *
     * public void run()
     *
     * run() method introduces a concurrent thread into your program. This thread will end when run() returns.
     * You must specify the code for your thread inside run() method.
     * run() method can call other methods, can use other classes and declare variables just like any other normal method.
     *
     * class MyThread implements Runnable {
     *
     * public void run() {
     *         System.out.println("Thread started running..");
     *     }
     *
     *     public static void main(String args[]) {
     *         MyThread mt = new MyThread();
     *         Thread t = new Thread(mt);
     *         newThread(t).start();
     *         t.start();
     *     }
     * }
     * Thread started running..
     *
     * To call the run() method, start() method is used. On calling start(), a new stack is provided to the thread and run() method is called to introduce the new thread into the program.
     *
     * Ending Thread
     * A Thread ends due to the following reasons:
     *
     * The thread ends when the run() method finishes its execution.
     * When the thread throws an Exception or Error that is not being caught in the program.
     * Java program completes or ends.
     * Another thread calls stop() methods.
     * Synchronization of Threads
     * At times when more than one thread tries to access a shared resource, we need to ensure that resource will be used by only one thread at a time. The process by which this is achieved is called synchronization.
     * The synchronization keyword in Java creates a block of code referred to as critical section.
     * By using this only one thread can access the method at a time and a second call will be blocked until the first call returns or wait() is called inside the synchronized method.
     *
     * Use Synchronization
     * If we do not use synchronization and let two or more threads access a shared resource at the same time, it will lead to distorted results.
     * The first Java concurrency model assumed that multiple threads executing within the same application would also share objects. This type of concurrency model is typically referred to as a "shared state concurrency model".
     */


    /**
     * Informational responses (100–199)
     * Successful responses (200–299)
     * Redirects (300–399)
     * Client errors (400–499)
     * Server errors (500–599)
     *
     * HTTP headers let the client and the server pass additional information with an HTTP request or response.
     * An HTTP response header is a component of a network packet that is sent by a Web server to a Web browser or client machine in response to an HTTP request. It is used in Web communications to deliver webpage and other Web-based data from the server to the requesting end-user browsers
     *
     *
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
