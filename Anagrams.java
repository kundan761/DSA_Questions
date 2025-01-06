import java.util.HashMap;

public class Anagrams {
    public static boolean anagrams(String str1, String str2){
        if(str1.length() != str2.length()){
            return false;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str1.length(); i++) {
            int freq = map.getOrDefault(str1.charAt(i), 0);
            map.put(str1.charAt(i), freq + 1);
        }
        for (int i = 0; i < str2.length(); i++) {
            int freq = map.getOrDefault(str2.charAt(i), 0);
            map.put(str2.charAt(i), freq + 1);
        }

        for (char c: map.keySet()) {
            if(map.get(c) < 2){
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        String str1 = "abcd";
        String str2 = "abcd";
        System.out.println(anagrams(str1, str2));
    }
}
