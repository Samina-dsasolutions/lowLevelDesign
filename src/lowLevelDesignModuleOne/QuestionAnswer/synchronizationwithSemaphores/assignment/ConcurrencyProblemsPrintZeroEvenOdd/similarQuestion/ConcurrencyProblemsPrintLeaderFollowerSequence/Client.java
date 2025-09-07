package lowLevelDesignModuleOne.QuestionAnswer.synchronizationwithSemaphores.assignment.ConcurrencyProblemsPrintZeroEvenOdd.similarQuestion.ConcurrencyProblemsPrintLeaderFollowerSequence;

import java.util.function.Consumer;

public class Client {
    public static void main(String[] args) {
        ConcurrencyProblemsPrintLeaderFollowerSequence
                concurrencyProblemsPrintLeaderFollowerSequence=
                new ConcurrencyProblemsPrintLeaderFollowerSequence(10);
        Consumer<Character> task =(Character c)->{
            System.out.print(c);
        };
        Thread t1=new Thread(()->{
            try {
                concurrencyProblemsPrintLeaderFollowerSequence.leader(task);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        Thread t2=new Thread(()->{
            try {
                concurrencyProblemsPrintLeaderFollowerSequence.follower1(task);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        Thread t3=new Thread(()->{
            try {
                concurrencyProblemsPrintLeaderFollowerSequence.follower2(task);
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
