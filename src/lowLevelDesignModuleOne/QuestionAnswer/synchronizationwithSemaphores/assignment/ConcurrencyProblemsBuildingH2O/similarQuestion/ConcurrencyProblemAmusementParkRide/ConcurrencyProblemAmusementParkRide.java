package lowLevelDesignModuleOne.QuestionAnswer.synchronizationwithSemaphores.assignment.ConcurrencyProblemsBuildingH2O.similarQuestion.ConcurrencyProblemAmusementParkRide;

import java.util.concurrent.Semaphore;

public class ConcurrencyProblemAmusementParkRide {
    private Semaphore adultSemaphore;
    private Semaphore childSemaphore;
    public ConcurrencyProblemAmusementParkRide() {
        this.adultSemaphore=new Semaphore(2);
        this.childSemaphore=new Semaphore(2);
    }
    public void boardAdult(Runnable releaseadultThread) throws InterruptedException {
        adultSemaphore.acquire(1);
        releaseadultThread.run();
        childSemaphore.release(1);
    }
    public void boardChild(Runnable releaseChildThread) throws InterruptedException {
        childSemaphore.acquire(2);
        releaseChildThread.run();
        adultSemaphore.release(2);
    }
}
