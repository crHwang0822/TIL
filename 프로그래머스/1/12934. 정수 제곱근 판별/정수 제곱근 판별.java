import java.lang.Math;

class Solution {
    public long solution(long n) {
        if(Math.sqrt(n) % 1 == 0)
            return ((long)Math.sqrt(n) + 1) * ((long)Math.sqrt(n) + 1); 
        return -1;
    }
}