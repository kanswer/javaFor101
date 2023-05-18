import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class partitionLabels763 {
    public static void main(String[] args) {
        String test = "ababcbacadefegdehijhklij";
        List<Integer> a = getA(test);
    }
    public static List<Integer> getA(String s){
        List<Integer> answer = new ArrayList<>();
        Map<Character, Integer> start = new HashMap<>();
        Map<Character, Integer> end = new HashMap<>();
        for(int i = 0;i < s.length();i++){
            if(!start.containsKey(s.charAt(i))){
                start.put(s.charAt(i), i);
                end.put(s.charAt(i), i);
            }
            end.put(s.charAt(i), i);
        }
        int[][] se = new int [start.size()][2];
        int i = 0;
        for(char key: start.keySet()){
            se[i][0] = start.get(key);
            se[i][1] = end.get(key);
            i++;
        }
        Arrays.sort(se, Comparator.comparingInt(o -> o[0]));
        for(int j=0;j<se.length;j++){
            int be = se[j][0];
            int endd = se[j][1];
            boolean f = true;
            while(j < se.length && se[j][0] < endd){
                endd = Math.max(se[j][1], endd); //防止本身没走j++
                j++;
                if(f){
                    f = false;
                }
            }
            if(!f){
                j--;
            }
            answer.add(endd-be+1);
        }
        return answer;
    }
}
