package lowLevelDesignModuleOne.QuestionAnswer.synchronizationwithSemaphores.assignment.ConcurrencyProblemsPrintZeroEvenOdd.similarQuestion.ConcurrencyProblemsPrintRGBSequence;

import java.util.concurrent.Semaphore;
import java.util.function.Consumer;

public class ConcurrencyProblemsPrintRGBSequence {
    private int n;
    private Semaphore rSemaphore;
    private Semaphore gSemaphore;
    private Semaphore bSemaphore;
    public ConcurrencyProblemsPrintRGBSequence(int n) {
        this.n = n;
        rSemaphore = new Semaphore(1);
        gSemaphore = new Semaphore(0);
        bSemaphore = new Semaphore(0);
    }
    public void red(Consumer<Character> rleaseR) throws InterruptedException {
        for (int i = 1; i <= n; i++) {
            rSemaphore.acquire();
            rleaseR.accept('R');
            gSemaphore.release();
        }
    }
    public void green(Consumer<Character> releaseG) throws InterruptedException {
        for (int i = 1; i <= n; i++) {
            gSemaphore.acquire();
            releaseG.accept('G');
            bSemaphore.release();
        }
    }
    public void blue(Consumer<Character> releaseB) throws InterruptedException {
        for (int i = 1; i <= n; i++) {
            bSemaphore.acquire();
            releaseB.accept('B');
            rSemaphore.release();
        }
    }
}
