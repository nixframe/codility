package pl.codility;

public class MinAvgTwoSlice {
    public int solution(int[] A) {
        float minAvg = Integer.MAX_VALUE;
        float tmpAvg2, tmpAvg3;
        int minAvgStrtPos=0;
        //stolen
        for (int i = 0; i < A.length - 2; i++) {
            tmpAvg2=(float)((A[i]+A[i+1])/2);
            tmpAvg3=(float)((A[i]+A[i+1]+A[i+2])/2);
            if(Math.min(tmpAvg2, tmpAvg3)<minAvg){
                minAvg=Math.min(tmpAvg2, tmpAvg3);
                minAvgStrtPos=i;
            }
        }
        tmpAvg2=(float)((A[A.length-2]+A[A.length-1])/2);
        if (tmpAvg2 < minAvg) {
            return A.length-2;
        }
        return minAvgStrtPos;
    }
}
