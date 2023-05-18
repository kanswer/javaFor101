import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.List;

public class bag01{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // int N = scan.nextInt(), V = scan.nextInt();
        // int[] w = new int[N];
        // int[] v = new int[N];
        // for(int i = 0; i<N; i++){
        //     w[i] = scan.nextInt();
        //     v[i] = scan.nextInt();
        // }
        List<Integer> weight = new ArrayList<>();
        List<Integer> value = new ArrayList<>();
        while(true){
            String s = scan.nextLine();
            if(s == ""){
                break;
            }
            else{
                Scanner sc = new Scanner(s);
                weight.add(sc.nextInt());
                value.add(sc.nextInt());
            }
        }
        int[] w = weight.stream().mapToInt(Integer::valueOf).toArray();
        int[] v = value.stream().mapToInt(Integer::valueOf).toArray();
        getValue(w, v, 5);
    }
    public static void getValue(int[] weight, int[] value, int size){
        int[][] dp = new int[weight.length][size+1];
        for(int j = weight[0]; j <= size; j++){
                dp[0][j] = value[0];
        }
        for(int i = 1; i < weight.length; i++){
            for(int j = 1; j< size+1; j++){
                if(j < weight[i]){
                    dp[i][j] = dp[i-1][j];
                }
                else{
                    dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-weight[i]] + value[i]);
                }
            }
        }
        System.out.println(dp[weight.length-1][size]);
    }
}