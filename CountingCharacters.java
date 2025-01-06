import java.util.HashMap;

public class CountingCharacters {
    public static String stringCompressor(String str){
        HashMap<Character, Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < str.length(); i++) {
            int freq = map.getOrDefault(str.charAt(i), 0);
            map.put(str.charAt(i), freq + 1);
        }

        for(char c: map.keySet()){
            sb.append(c);
            sb.append(map.get(c));
        }

        return sb.toString();
    }
    public static void main(String[] args) {
        String str = "aabbcccccdd";
        System.out.println(stringCompressor(str));
    }
}
