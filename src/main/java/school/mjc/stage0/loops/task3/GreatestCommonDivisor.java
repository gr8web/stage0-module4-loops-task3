package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        int smaller = 0;
        if (first == 0){
            System.out.println(second);
            return;
        }
        if (second == 0){
            System.out.println(first);
            return;
        }
        if (first == second){
            System.out.println(first);
            return;
        }
        if (first > second) {
            smaller = second;
        } else {
            smaller = first;
        }

        int result = 1;
        for (int gcd = 1; gcd <= smaller; gcd++) {
            if (first % gcd == 0 && second % gcd == 0) {
                result = gcd;
            }
        }
        System.out.println(result);
    }
}
