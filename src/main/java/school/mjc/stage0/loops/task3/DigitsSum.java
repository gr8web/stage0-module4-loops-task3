package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){
        if (t < 0) {
            t *= -1;
        }
        int sum = 0;
        for (; t / 10 > 0 ; t /= 10) {
            sum += t % 10;
        }
        sum += t % 10;
        System.out.println(sum);
    }
}
