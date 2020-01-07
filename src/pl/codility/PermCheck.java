package pl.codility;

public class PermCheck {
    public int solution(int[] A) {
        boolean[] check = new boolean[A.length + 1];
        for (int i = 0; i < A.length; i++) {
            if (A[i] < 1 || A[i] > A.length) return 0;
            if (check[A[i]]) return 0;
            else check[A[i]] = true;
        }
        return 1;
    }
}
