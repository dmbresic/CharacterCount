import java.util.HashMap;
import java.util.Map;

public class CountChar {
    public Map<Character, Integer> countChar(String s){
        Map<Character, Integer> map = new HashMap<>();

        s.replaceAll(" ", "");

        char[] c = s.toCharArray();

        for(int i = 0; i < c.length; i++){
            if(!map.containsKey(c[i])){
                map.put(c[i], 1);
            }else{
                map.put(c[i], map.get(c[i]) + 1);
            }
        }

        return map;
    }
}
