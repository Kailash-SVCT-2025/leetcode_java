class Solution {
    public int mySqrt(int x) {
        if (x == 0 || x == 1) return x;  

        long start = 1, end = x;
        while (start <= end) {
            long mid = start + (end - start) / 2;
            long square = mid * mid;

            if (square == x) {
                return (int) mid;
            } else if (square < x) {
                start = mid + 1;  
            } else {
                end = mid - 1;
            }
        }

        return (int) end;  
    }
}
