class Solution {
    public int[] solution(int n, int m) {
        int[] answer = {gcd(n,m), lcm(n,m)};
        return answer;
    }
    
    public int lcm(int n, int m){
        return n * m / gcd(n,m);
    }
    
    public int gcd(int n, int m){
        if(n % m == 0)
            return m;
        return gcd(m, n % m);
    }
    
}