package lowLevelDesignModuleOne.QuestionAnswer.synchronizationwithSemaphores.assignment.ConcurrencyProblemsBuildingH2O.similarQuestion.ConcurrencyProblemAmusementParkRide;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        //create two task one for adult and one for child
        ConcurrencyProblemAmusementParkRide
                concurrencyProblemAmusementParkRide =
                new ConcurrencyProblemAmusementParkRide();

        Runnable childGroup = () -> {
            System.out.print("C");
        };
        Runnable parentGroup = () -> {
            System.out.print("P");
        };

        List<Thread> threads = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Thread t1 = new Thread(() -> {
                try {
                    concurrencyProblemAmusementParkRide.boardAdult(parentGroup);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
            threads.add(t1);
            t1.start();
        }
        for (int i = 0; i < 10; i++) {
            Thread t2 = new Thread(() -> {
                try {
                    concurrencyProblemAmusementParkRide.boardChild(childGroup);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
            threads.add(t2);
            t2.start();
        }
        for (Thread thread : threads) {
            try{
                thread.join();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("\nAll riders have boarded.");
    }
}
