package pl.codility;

public class PassingCars {
    public int solution(int[] A) {
        int east = 0, west = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == 0) east++;
            if (A[i] == 1) west += east;
            if (west > 1000000000) return -1;
        }
        return west;
    }
}
