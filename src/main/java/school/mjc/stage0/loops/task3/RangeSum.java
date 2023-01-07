package school.mjc.stage0.loops.task3;

public class RangeSum {
    public void printSumInclusive(int firstBoarder, int secondBoarder) {
        if (firstBoarder == secondBoarder) {
            System.out.println(firstBoarder);
            return;
        }
        int sum = 0;
        for (int i = firstBoarder; i <= secondBoarder; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
