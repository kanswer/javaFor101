public class maxProfit122 {
    public static void main(String[] args){
        int[] prices = {1,5,3,6};
        int answer = getAnswer(prices);
    }
    public static int getAnswer(int[] prices){
        int answer = getA(0, 0, -1, prices);
        return answer;
    }
    public static int getA(int p, int s, int c, int[] prices){
        if(p == prices.length){
            return 0;
        }
        if(s == 1){
            return Math.max(prices[p] - prices[c] + getA(p+1,0,-1,prices), 0 + getA(p+1,1,c,prices));
        }
        else{
            return Math.max(getA(p+1, 1, p, prices), getA(p+1, 0, -1, prices));
        }
    }
    public int getA(int[] prices){
        int answer = 0;
        for(int i = 1;i<prices.length;i++){
            answer += Math.max(prices[i]-prices[i-1], 0);
        }
        return answer;
    }
}
