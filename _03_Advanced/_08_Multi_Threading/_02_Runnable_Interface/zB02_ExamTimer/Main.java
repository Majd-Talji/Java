package _03_Advanced._08_Multi_Threading._02_Runnable_Interface.zB02_ExamTimer;

import java.util.Scanner;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ExamTimer et = new ExamTimer();
        
        Thread t = new Thread(et);

        int num1;
        int num2;
        int userAnswer;
        int operationsCounter = 0;
        int correctAnswersCounter = 0;
        int wrongAnswersCounter = 0;

        t.start();

        System.out.println("---------- Quiz ----------");

        while (t.isAlive()) {

            num1 = (int) (Math.random() * 10);
            num2 = (int) (Math.random() * 10);

            System.out.print(num1 + " + " + num2 + " = ");
            userAnswer = input.nextInt();

            if (userAnswer == num1 + num2) {
                correctAnswersCounter++;
            } else {
                wrongAnswersCounter++;
            }

            operationsCounter++;

        }

        System.out.println("Time end...\n");

        System.out.println("--------- Result --------");
        System.out.println("Number of operations:      " + operationsCounter);
        System.out.println("Number of corrent answers: " + correctAnswersCounter);
        System.out.println("Number of wrong answers:   " + wrongAnswersCounter);

    }

}
