package utilities;

public class Algo2 {
    /**
     *life cycle
     *	NEW newly created thread that has not yet started the execution
     * 	.	RUNNABLE –either running or ready for execution but it's waiting for resource allocation
     * 	.	BLOCKED –waiting to acquire a monitor lock to enter or re-enter a synchronized block/method
     * 	.	WAITING –waiting for some other thread to perform a particular action without any time limit
     * 	.	TIMED_WAITING –waiting for some other thread to perform a specific action for a specified period
     * 	.	TERMINATED –has completed its execution
     *
     * Deadlock describes a situation where two or more threads are blocked forever, waiting for each other.
     * Deadlock occurs when multiple threads need the same locks but obtain them in different order.
     *TO PREVENT DEADLOCK
     * If you make sure that all locks are always taken in the same order by any thread, deadlocks cannot occur.
     * Lock Timeout
     * Another deadlock prevention mechanism is to put a timeout on lock attempts meaning a thread trying to obtain a lock will only try for so long before giving up
     *
     *
     * Advantages of multithreading
     *
     * 1) It doesn't block the user because threads are independent and you can perform multiple operations at the same time.
     * 2) You can perform many operations together, so it saves time.
     * 3) Threads are independent, so it doesn't affect other threads if an exception occurs in a single 
     * THREAD SAFETY
     * This means that different threads can access the same resources without exposing erroneous behavior or producing unpredictable results. This programming methodology is known as “thread-safety”.
     * #
     * Advantages
     * Disadvantages
     * 1
     * Advantages: We can execute multiple tasks of an application at a time
     * Disadvantages: Thread synchronization is an extra over head to the developers
     * 2
     * Reduces the complexity of a big applications
     * Shares the common data across the threads might cause the data inconsistency or thread sync issues
     * 3
     * Helps to improve the performance of an application drastically
     * Threads blocking for resources is more common problem
     * 4
     * Utilizes the max resources of multiprocessor systems
     * Difficult in managing the code in terms of debugging or writing the code
     * 5
     * Better user interface in case of GUI based applications
     *
     * 6
     * Reduces the development time of an application
     *
     * 7
     * All the threads are independent , any unexpected exception happens in any of the thread will not lead to an application exit.
     *
     * S.NO
     * Multitasking
     * Multithreading
     * 1.
     * In multitasking, users are allowed to perform many tasks by CPU.
     * While in multithreading, many threads are created from a process through which computer power is increased.
     * 2.
     * Multitasking involves often CPU switching between the tasks.
     * While in multithreading also, CPU switching is often involved between the threads.
     * 3.
     * In multitasking, the processes share separate memory.
     * While in multithreading, processes are allocated same memory.
     * 4.
     * Multitasking component involves multiprocessing.
     * While multithreading component does not involve multiprocessing.
     * 5.
     * In multitasking, CPU is provided in order to execute many tasks at a time.
     * While in multithreading also, CPU is provided in order to execute many threads from a process at a time.
     * 6.
     * In multitasking, processes don’t share same resources, each process is allocated separate resources.
     * While in multithreading, each process share same resources.
     * 7.
     * Multitasking is slow compared to multithreading.
     * While multithreading is faster.
     * 8.
     * In multitasking, termination of process takes more time.
     * While in multithreading, termination of thread takes less time.
     *
     *
     *
     *
     * TASK SCHEDULING means planning a something i.e a program or a function to happen at a particular time and frequency.
     *
     * **/
}
