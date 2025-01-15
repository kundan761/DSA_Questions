public class VowelConsonantCount {
    public static void countVowelConsonant(String str){
        int vowel = 0;
        int consonant = 0;
        String newStr = str.toLowerCase();
        for (char c : newStr.toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowel++;
            } else {
                consonant++;
            }
        }

        System.out.println("Vowels : - " + vowel);
        System.out.println("Consonants : - " + consonant);
    }
    public static void main(String[] args) {
        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        countVowelConsonant(str);
    }
}
