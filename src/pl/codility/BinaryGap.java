package pl.codility;

public class BinaryGap {
    public int solution(int N) {
        int maxGap = 0;
        int tmp = 0;
        String binary = Integer.toBinaryString(N);
        for (int i = 1; i < binary.length(); i++) {
            if (binary.charAt(i) == '0')
                tmp++;
            if (binary.charAt(i) == '1') {
                if (tmp > maxGap) maxGap = tmp;
                tmp = 0;
            }
        }
        return maxGap;
    }
}
