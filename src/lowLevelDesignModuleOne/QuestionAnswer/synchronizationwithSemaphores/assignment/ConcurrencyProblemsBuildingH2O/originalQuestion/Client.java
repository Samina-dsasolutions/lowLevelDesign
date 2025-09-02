package lowLevelDesignModuleOne.QuestionAnswer.synchronizationwithSemaphores.assignment.ConcurrencyProblemsBuildingH2O.originalQuestion;

import java.util.concurrent.CountDownLatch;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        ConcurrencyProblemsBuildingH2O h2o = new ConcurrencyProblemsBuildingH2O();
        int n = 3; // number of water molecules to form
        CountDownLatch latch = new CountDownLatch(3 * n); // 3 atoms per molecule

        Runnable releaseHydrogen = () -> {
            System.out.print("H");
            latch.countDown();
        };
        Runnable releaseOxygen = () -> {
            System.out.print("O");
            latch.countDown();
        };

        for (int i = 0; i < 2 * n; i++) {
            new Thread(() -> {
                try {
                    h2o.hydrogen(releaseHydrogen);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
        }

        for (int i = 0; i < n; i++) {
            new Thread(() -> {
                try {
                    h2o.oxygen(releaseOxygen);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
        }

        latch.await();
        System.out.println("\nAll water molecules formed!");

    }
}


