package _03_Advanced._08_Multi_Threading._02_Runnable_Interface.zB04_Alert;

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

        Thread alertThread = new Thread(alert);

        boolean isStarted = false;

        System.out.println("----- Alert Menu ------\n"
                + "| Enter (1) to Start  |\n"
                + "| Enter (2) to Pause  |\n"
                + "| Enter (3) to Resume |\n"
                + "| Enter (4) to Stop   |\n"
                + "-----------------------");

        while (!alertThread.isInterrupted()) {

            System.out.print("User input >> ");
            userInput = input.nextInt();

            switch (userInput) {

                case 1:
                    if (isStarted == false) {
                        alertThread.start();
                        isStarted = true;
                    } else {
                        alertThread.resume();
                    }
                    break;

                case 2:
                    alertThread.suspend();
                    break;

                case 3:
                    alertThread.resume();
                    break;

                case 4:
                    alertThread.interrupt();
                    alertThread.stop();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Option <" + userInput + "> Not Found!");
                    break;

            }

        }

    }

}
