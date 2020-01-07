package codility;

import java.util.HashMap;

public class OddOccurrencesInArray {
    public int solution(int[] A) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int tmp = 0;

        for (int i : A) {
            if (map.containsKey(i)) {
                tmp = map.get(i);
                map.put(i, tmp + 1);
            } else {
                map.put(i, 1);
            }
        }

        for (int i : map.keySet()) {
            if ((map.get(i) % 2) != 0) tmp = i;
        }
        return tmp;

        //works instead of rewriting tmp
        //throw new RuntimeException("Not an odd array");
    }
}
