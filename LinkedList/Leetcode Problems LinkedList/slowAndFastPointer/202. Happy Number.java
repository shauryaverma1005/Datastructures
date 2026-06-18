class Solution {
    public int sqr(int no){
        int sum =0;
        while(no>0){
            int d = no%10;
            no = no/10;
            sum += d*d;
        }
        return sum;
    }
    public boolean isHappy(int n) {
        int slow=n;
        int fast =n;
        while(slow != 1){
            slow = sqr(slow);
            fast = sqr(fast);
            fast = sqr(fast);
            if(slow == fast && slow!=1){
                return false;
            }
        }
        return true;
    }
}