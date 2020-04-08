package _03_Advanced._08_Multi_Threading._01_Thread_Class.zB03_Multi_Threads;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class MyThread extends Thread{

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        
        while (!this.isInterrupted()) {   
            
            System.out.println(this.getName());
            
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            
        }
        
    }
    
}
