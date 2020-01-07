package pl.codility;

public class PermMissingElem {
    public int solution(int[] A) {
        long tmp = 0;
        long sum = (A.length + 1) * (A.length + 2) / 2;
        for (int i = 0; i < A.length; i++) {
            tmp += A[i];
        }
        return (int) (sum - tmp);
    }
}
