package _03_Advanced._08_Multi_Threading._03_ThreadGroup_Class;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main {
    
    public static void main(String[] args) {
        
        ThreadGroup tg = new ThreadGroup("tg Grunp");
        
        Thread t1 = new Thread(tg, new MyRunnable(), "Thread 1");
        
        Thread t2 = new Thread(tg, new MyRunnable(), "Thread 2");
        
        t1.start();
        
        t2.start();
        
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        tg.interrupt();
        
        System.out.println("All Thread in 'tg group' are interrupted!");
        
    }
    
}
