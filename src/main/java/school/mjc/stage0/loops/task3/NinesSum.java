package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        if (lengthOfLastNumber < 0) {
            System.out.println(0);
            return;
        }
        int num = 0;
        int pow = 1;
        for (int i = 0; i < lengthOfLastNumber; i++) {
            num += 9 * pow;
            pow *= 10;
        }
        int sum = num;
        for (; num / 10 > 0 ; num /= 10) {
            sum += num / 10;
        }
        System.out.println(sum);
    }
}
