package _03_Advanced._08_Multi_Threading._02_Runnable_Interface.zB03_Multi_Threads;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main {
    
    public static void main(String[] args) {
        
        MyRunnable mr1 = new MyRunnable("Runnable 1");
        MyRunnable mr2 = new MyRunnable("Runnable 2");
        MyRunnable mr3 = new MyRunnable("Runnable 3");
        
        Thread t1 = new Thread(mr1);
        Thread t2 = new Thread(mr2);
        Thread t3 = new Thread(mr3);
        
        t1.start();
        t2.start();
        t3.start();
        
    }
    
}
