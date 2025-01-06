public class LongestSubstring {
    public static int longestSubstringWithoutRepeating(String str) {
        int maxlength = 0;
        for (int i = 0; i < str.length(); i++) {
            boolean[] seen = new boolean[256];
            int length = 0;
            for (int j = i; j < str.length(); j++) {
                if (seen[str.charAt(j)]) {
                    break;
                } else if (seen[str.charAt(j)] = true) {
                    length++;
                }
            }
            if(length > maxlength){
                maxlength = length;
            }
        }
        return  maxlength;
    }

    public static void main(String[] args) {
        String str = "abcabcbb";
        System.out.println(longestSubstringWithoutRepeating(str));
    }
}

// ### Dry Run Example with "abcabcbb"
// Let's dry run with the string `"abcabcbb"`.

// 1. **Outer Loop (i=0)**:
//    - `seen`: [false, false, ...] (all false)
//    - `length`: 0
//    - **Inner Loop**:
//      - `j=0` -> 'a' (not seen): `seen['a']=true`, `length=1`
//      - `j=1` -> 'b' (not seen): `seen['b']=true`, `length=2`
//      - `j=2` -> 'c' (not seen): `seen['c']=true`, `length=3`
//      - `j=3` -> 'a' (seen): break
//    - `maxlength`: 3

// 2. **Outer Loop (i=1)**:
//    - `seen`: [false, false, ...] (all false)
//    - `length`: 0
//    - **Inner Loop**:
//      - `j=1` -> 'b' (not seen): `seen['b']=true`, `length=1`
//      - `j=2` -> 'c' (not seen): `seen['c']=true`, `length=2`
//      - `j=3` -> 'a' (not seen): `seen['a']=true`, `length=3`
//      - `j=4` -> 'b' (seen): break
//    - `maxlength`: 3

// 3. **Outer Loop (i=2)**:
//    - `seen`: [false, false, ...] (all false)
//    - `length`: 0
//    - **Inner Loop**:
//      - `j=2` -> 'c' (not seen): `seen['c']=true`, `length=1`
//      - `j=3` -> 'a' (not seen): `seen['a']=true`, `length=2`
//      - `j=4` -> 'b' (not seen): `seen['b']=true`, `length=3`
//      - `j=5` -> 'c' (seen): break
//    - `maxlength`: 3

// 4. **Outer Loop (i=3)**:
//    - `seen`: [false, false, ...] (all false)
//    - `length`: 0
//    - **Inner Loop**:
//      - `j=3` -> 'a' (not seen): `seen['a']=true`, `length=1`
//      - `j=4` -> 'b' (not seen): `seen['b']=true`, `length=2`
//      - `j=5` -> 'c' (not seen): `seen['c']=true`, `length=3`
//      - `j=6` -> 'b' (seen): break
//    - `maxlength`: 3

// The process continues for `i=4`, `i=5`, etc., but `maxlength` remains 3. Therefore, the function correctly returns `3` for the input string `"abcabcbb"`.
