import java.util.Arrays;

public class candy{
    public static void main(String[] args) {
        int[] a = {1, 0, 2};
        int c = getn(a);
    }
    public static int getn(int[] a){
        int answer = 0;
        int[] b = new int[a.length];
        Arrays.fill(b, 1);
        for(int i=0;i<a.length-1;i++){
            if((a[i+1] > a[i]) && (b[i+1] <= b[i])){
                b[i+1] = b[i] + 1;
            }
        }
        for(int i=a.length-1;i>0;i--){
            if((a[i-1] > a[i]) && (b[i-1] <= b[i])){
                b[i-1] = b[i] + 1;
            }
        }
        for(int i=0;i<a.length;i++){
            answer += b[i];
        }
        return answer;
    }
}