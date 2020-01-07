package pl.codility;

import java.util.Arrays;

public class MaxCounter {
    public int[] solution(int N, int[] A) {
        int[] counter = new int[N];
        int lastMax = 0, tmp = 0;

        for (int i = 0; i < A.length; i++) {
            if (A[i] >= 1 && A[i] <= N) {
                counter[A[i] - 1] = Math.max(counter[A[i] - 1], lastMax);
                counter[A[i] - 1]++;
                tmp = Math.max(counter[A[i] - 1], tmp);
            } else if( A[i] == N+1) {
                lastMax =tmp;
            }
        }
        for(int i = 0 ; i < counter.length; i++) {
            counter[i] = Math.max(counter[i], lastMax);
        }
        return counter;
    }
}
