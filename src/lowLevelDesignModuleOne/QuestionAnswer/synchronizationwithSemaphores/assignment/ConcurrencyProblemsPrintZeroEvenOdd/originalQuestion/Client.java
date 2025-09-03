package lowLevelDesignModuleOne.QuestionAnswer.synchronizationwithSemaphores.assignment.ConcurrencyProblemsPrintZeroEvenOdd.originalQuestion;

import java.util.function.IntConsumer;

public class Client {
    public static void main(String[] args) {
        ConcurrencyProblemsPrintZeroEvenOdd
                concurrencyProblemsPrintZeroEvenOdd=
                new ConcurrencyProblemsPrintZeroEvenOdd(10);
        //create task
        IntConsumer intConsumer = i -> {
            System.out.print(i);
        };

            Thread t1=new Thread(()->{
                try {
                    concurrencyProblemsPrintZeroEvenOdd.zero(intConsumer);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            });
            Thread t2=new Thread(()->{
                try {
                    concurrencyProblemsPrintZeroEvenOdd.even(intConsumer);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            });

            Thread t3=new Thread(()->{
                try {
                    concurrencyProblemsPrintZeroEvenOdd.odd(intConsumer);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            });
            t1.start();
            t2.start();
            t3.start();

            try{
                t1.join();
                t2.join();
                t3.join();
            }catch (InterruptedException e){
                throw new RuntimeException(e);
            }


    }
}
