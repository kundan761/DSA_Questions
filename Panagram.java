// A panagram is a string that contains every letter of the alphabet at least once
public class Panagram {
    public static boolean isPanagram(String str){
        boolean [] seen = new boolean[26];
        str = str.toLowerCase();
        // System.out.println(str);
        for (char c : str.toCharArray()) {
            if(c >= 'a' && c <= 'z'){
                seen[c -'a'] = true;
            }
        }
        for (boolean b : seen) {
            if(!b){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "The quick brown fox jumps over the lazy dog";
        System.out.println(isPanagram(str));;
    }
}
