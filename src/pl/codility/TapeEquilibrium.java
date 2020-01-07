package pl.codility;

public class TapeEquilibrium {
    public int solution(int[] A) {
        long sumAll = 0, sum = 0;
        int diff = Integer.MAX_VALUE, tmp=Integer.MAX_VALUE;
        for (int i = 0; i < A.length; i++) {
            sumAll += A[i];
        }

        for (int i = 0; i < A.length; i++) {
            sum += A[i];
            tmp = (int) Math.abs(sum - (sumAll-sum));
            diff = Math.min(tmp, diff);
        }

        return diff;
    }
}
