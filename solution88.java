import java.util.Scanner;
import java.util.Vector;
public class solution88{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int V = scan.nextInt();
        int [] w = new int[N];
        int [] v = new int[N];
        while()
        
    }
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int pos = m-- + n-- - 1;
        while(m>=0 && n>=0){
            nums1[pos--] = nums1[m]>nums2[n]?nums1[m--]:nums2[n--];
        }
        while(n>=0){
            nums1[pos--] = nums2[n--];
        }

    }
}