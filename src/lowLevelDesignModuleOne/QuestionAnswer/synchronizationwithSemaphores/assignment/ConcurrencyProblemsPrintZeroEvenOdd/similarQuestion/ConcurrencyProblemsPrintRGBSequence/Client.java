package lowLevelDesignModuleOne.QuestionAnswer.synchronizationwithSemaphores.assignment.ConcurrencyProblemsPrintZeroEvenOdd.similarQuestion.ConcurrencyProblemsPrintRGBSequence;

import java.util.function.Consumer;

public class Client {
    public static void main(String[] args) {
        ConcurrencyProblemsPrintRGBSequence
                concurrencyProblemsPrintRGBSequence=
                new ConcurrencyProblemsPrintRGBSequence(10);
        //craete task
        Consumer<Character> printColour=(Character c)->{
            System.out.print(c);
        };
        Thread t1=new Thread(()->{
            try {
                concurrencyProblemsPrintRGBSequence.red(printColour);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        Thread t2=new Thread(()->{
            try {
                concurrencyProblemsPrintRGBSequence.green(printColour);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        Thread t3=new Thread(()->{
            try {
                concurrencyProblemsPrintRGBSequence.blue(printColour);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        t1.start();
        t2.start();
        t3.start();
        try {
            t1.join();
            t2.join();
            t3.join();
        }catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
