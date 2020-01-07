package codility;

public class FrogJmp {
    public int solution(int X, int Y, int D) {
        // adding D - 1 gives us this extra jump if its necessary and enables rounding to int
        return (int)(Y-X+(D-1))/D;
    }
}
