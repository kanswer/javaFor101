import java.util.Arrays;
import java.util.Comparator;

public class overlapping {
    public static void main(String args[]) {
        int[][] a ={{1,2},{2,4},{1,3}};
        int answer = getn(a);
    }
    public static int getn(int a[][]){
        int answer = 0;
        Arrays.sort(a, new Comparator<int[]>(){
            public int compare(int[] a, int[] b){
                return a[1] - b[1];
            }
        });
        int endd = a[0][1];
        for(int i=1;i<a.length;i++){
            if(a[i][0] < endd){
                answer++;
                continue;
            }
            else{
                endd = a[i][1];
                continue;
            }
        }
        return answer;
    }
}
