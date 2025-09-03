package lowLevelDesignModuleOne.QuestionAnswer.synchronizationwithSemaphores.assignment.ConcurrencyProblemsPrintZeroEvenOdd.originalQuestion;

import java.util.concurrent.Semaphore;
import java.util.function.IntConsumer;

public class ConcurrencyProblemsPrintZeroEvenOdd {
    private int n;
    private Semaphore zeroSemaphore;
    private Semaphore oddSemaphore;
    private Semaphore evenSemaphore;
    public ConcurrencyProblemsPrintZeroEvenOdd(int n) {
        this.n = n;
        zeroSemaphore = new Semaphore(1);
        oddSemaphore = new Semaphore(0);
        evenSemaphore = new Semaphore(0);
    }
    /*
     IntConsumer printNumber = (x) -> System.out.println(x);
     */
    public void zero(IntConsumer printNumber) throws InterruptedException {
        for (int i = 1; i <= n; i++) {
            zeroSemaphore.acquire(1);
            printNumber.accept(0);
            if(i%2==0){
                evenSemaphore.release(1);
            }else{
                oddSemaphore.release(1);
            }
        }
    }
    public void odd(IntConsumer printNumber) throws InterruptedException {
        for (int i = 1; i <= n; i+=2) {
            oddSemaphore.acquire(1);
            printNumber.accept(i);
            zeroSemaphore.release(1);
        }
    }
    public void even(IntConsumer printNumber) throws InterruptedException {
        for (int i = 2; i <= n; i+=2) {
            evenSemaphore.acquire(1);
            printNumber.accept(i);
            zeroSemaphore.release(1);
        }
    }
}
