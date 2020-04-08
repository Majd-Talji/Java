package _03_Advanced._08_Multi_Threading._01_Thread_Class.zB04_Alert;

import java.util.Scanner;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int userInput;
        
        Alert alert = new Alert();
        
        System.out.println("----- Alert Menu ------\n"
                         + "| Enter (1) to Start  |\n"
                         + "| Enter (2) to Pause  |\n"
                         + "| Enter (3) to Resume |\n"
                         + "| Enter (4) to Stop   |\n"
                         + "-----------------------");
        
        while (!alert.isInterrupted()) {           
            
            System.out.print("User input >> ");
            userInput = input.nextInt();
            
            switch(userInput) {
                
                case 1:
                    alert.start();
                    break;
                    
                case 2:
                    alert.suspend();
                    break;
                    
                case 3:
                    alert.resume();
                    break;
                    
                case 4:
                    alert.interrupt();
                    alert.stop();
                    break;
                     
                default:
                    System.out.println("Option <" + userInput + "> Not Found!");
                
            }
            
        }
        
    }
    
}
