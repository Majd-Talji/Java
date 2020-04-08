package _03_Advanced._08_Multi_Threading._02_Runnable_Interface.zB01_RealTime;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main {
    
    public static void main(String[] args) {
        
        RealTime rt = new RealTime();
        
        Thread t = new Thread(rt);
        
        t.start();
        
    }
    
}
