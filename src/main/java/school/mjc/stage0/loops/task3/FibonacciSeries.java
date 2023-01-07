package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int lastFib = 1;
        int preLastFib = 1;
        int currentFib = 0;
        for (int i = 0; i < lastFibonacci; i++) {
            if (i == 0) {
                System.out.println(0);
                continue;
            }
            if (i == 1 || i == 2) {
                System.out.println(1);
                continue;
            }
            currentFib = lastFib + preLastFib;
            preLastFib = lastFib;
            lastFib = currentFib;

            System.out.println(currentFib);
        }
    }
}
