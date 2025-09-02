package lowLevelDesignModuleOne.QuestionAnswer.synchronizationwithSemaphores.assignment.ConcurrencyProblemsBuildingH2O.originalQuestion;

import java.util.concurrent.Semaphore;

public class ConcurrencyProblemsBuildingH2O {
    private Semaphore hydrogenSemaphore;
    private Semaphore oxygenSemaphore;
    public ConcurrencyProblemsBuildingH2O() {
        hydrogenSemaphore = new Semaphore(2);
        oxygenSemaphore = new Semaphore(0);
    }
    public void hydrogen(Runnable releaseHydrogen) throws InterruptedException {
        hydrogenSemaphore.acquire(1);
        releaseHydrogen.run();
        oxygenSemaphore.release(1);
    }
    public void oxygen(Runnable releaseOxygen) throws InterruptedException {
        oxygenSemaphore.acquire(2);
        releaseOxygen.run();
        hydrogenSemaphore.release(2);
    }

}
