package pl.codility;

import java.util.HashSet;

public class MissingInteger {
    public int solution(int[] A) {
        HashSet<Integer> seen = new HashSet<>();
        int number = 1;
        for (int i : A) {
            seen.add(i);
        }
        while (seen.contains(number)) {
            number++;
        }
        return number;
    }
}
