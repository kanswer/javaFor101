import java.util.Map;
import java.util.HashMap;

public class solution76{
    public static void main(String[] args){
    
    }
    public String minWindow(String s, String t) {
        //统计t中包含各个字母的个数
        Map<Character, Integer> static_t = new HashMap<>();
        Map<Character, Boolean> is_t = new HashMap<>();
        for(int i=0;i<t.length();i++){
            if(static_t.containsKey(t.charAt(i))){
                static_t.put(t.charAt(i), static_t.get(t.charAt(i))+1);
            }
            else{
                static_t.put(t.charAt(i), 1);
                is_t.put(t.charAt(i), true);
            }
        }
        int l = 0, cnt = 0, min_size = s.length()+1, min_l = 0;
        for(int r=0;r<s.length();r++){
            if(is_t.containsKey(s.charAt(r))){
                static_t.put(s.charAt(r), static_t.get(s.charAt(r))-1);
                if(static_t.get(s.charAt(r)) >= 0){
                    cnt++;
                }
                while(cnt == t.length()){//判断是否满足条件
                    if(r-l+1<min_size){
                        min_size = r-l+1;
                        min_l = l;
                    }
                    if(is_t.containsKey(s.charAt(l))){//判断cnt是否应该被减，可能冗余
                        static_t.put(s.charAt(l), static_t.get(s.charAt(l))+1);//开始右移准备
                        if(static_t.get(s.charAt(l))>0){
                            cnt--;
                        }
                    }
                    ++l;//右移完成
                }
            }
        }
        return min_size > s.length() ? "" : s.substring(min_l, min_l+min_size);
    }
}
