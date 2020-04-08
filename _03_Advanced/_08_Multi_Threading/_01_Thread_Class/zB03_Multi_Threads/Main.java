package _03_Advanced._08_Multi_Threading._01_Thread_Class.zB03_Multi_Threads;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main {
    
    public static void main(String[] args) {
        
        MyThread t1 = new MyThread("Thread 1");
        MyThread t2 = new MyThread("Thread 2");
        MyThread t3 = new MyThread("Thread 3");
        
        t1.start();
        t2.start();
        t3.start();
        
    }
    
}
