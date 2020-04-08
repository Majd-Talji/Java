package _03_Advanced._08_Multi_Threading._02_Runnable_Interface.zB02_ExamTimer;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class ExamTimer implements Runnable{

    @Override
    public void run() {
        
        try {
            
            Thread.sleep(20000);
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }
    
}
