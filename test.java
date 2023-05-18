import java.util.Arrays;
import java.util.Comparator;
public class test {
    public static void main(String[] args){
        int [][] test = {{10,16},{2,8},{1,6},{7,12}};
        int c = 16>15? 1:0;
        int answer = findMinArrowShots(test);
    }
    public static int findMinArrowShots(int[][] points) {
        int answer = 0;
        int[] finished = new int[points.length];
        // Arrays.sort(points, new Comparator<int[]>(){
        //     public int compare(int[] a, int[] b){
        //         return a[1] - b[1];
        //     }
        // });
        Arrays.sort(points, Comparator.comparingInt(o -> o[1]));
        for(int i=0;i<points.length;i++){
            int j = i;
            if(finished[i]!=1){
                while(i<points.length && points[i][0] <= points[j][1]){
                    finished[i] = 1;
                    i++;
                }
                i--;
                answer += 1;
            }
        }
        return answer;
    }
}
