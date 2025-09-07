package lowLevelDesignModuleOne.QuestionAnswer.synchronizationwithSemaphores.assignment.ConcurrencyProblemsPrintZeroEvenOdd.similarQuestion.ConcurrencyProblemsPrintLeaderFollowerSequence;

import java.util.concurrent.Semaphore;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

public class ConcurrencyProblemsPrintLeaderFollowerSequence {
    private int n;
    private Semaphore leaderSemaphore;
    private Semaphore followerOneSemaphore;
    private Semaphore followerTwoSemaphore;
    public ConcurrencyProblemsPrintLeaderFollowerSequence(int n) {
        this.n = n;
        leaderSemaphore = new Semaphore(1);
        followerOneSemaphore = new Semaphore(0);
        followerTwoSemaphore = new Semaphore(0);
    }
    public void leader(Consumer<Character> printLeader) throws InterruptedException {
        for(int i=1;i<=n;i++){
            leaderSemaphore.acquire();
            printLeader.accept('L');
            followerOneSemaphore.release();
        }

    }
    public void follower1(Consumer<Character> printFollower) throws InterruptedException {
        for(int i=1;i<=n;i++){
            followerOneSemaphore.acquire();
            printFollower.accept('F');
            followerTwoSemaphore.release();
        }

    }
    public void follower2(Consumer<Character> printFollower) throws InterruptedException {
        for(int i=1;i<=n;i++){
            followerTwoSemaphore.acquire();
            printFollower.accept('f');
            leaderSemaphore.release();
        }
    }
}
