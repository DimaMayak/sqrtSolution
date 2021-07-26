public class Solution {
    static int mySqrtTest (int i){
        int x=0;
        while (true) {
            if (x*x==i)
            break;
            if (x*x>i){
                x=x-1;
                break;
            }
            else x=x+1;
        }
        return x;
    }
    static int mySqrt (int i){
       int x= (int) Math.sqrt(i);
        return x;
    }
}
